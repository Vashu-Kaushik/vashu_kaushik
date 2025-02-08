import pygame
import random

# Initialize Pygame
pygame.init()

# Screen dimensions
WIDTH, HEIGHT = 800, 600
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Endless Runner")

# Colors
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)
RED = (255, 0, 0)

# Load player
player_size = 50
player_x = WIDTH // 3
player_y = HEIGHT - 2 * player_size
player_speed = 7

def draw_player(x, y):
    pygame.draw.rect(screen, RED, (x, y, player_size, player_size))

# Obstacles
obstacle_width = 40
obstacle_height = 40
obstacle_x = random.randint(WIDTH // 2, WIDTH - obstacle_width)
obstacle_y = -obstacle_height
obstacle_speed = 10

def draw_obstacle(x, y):
    pygame.draw.rect(screen, BLACK, (x, y, obstacle_width, obstacle_height))

# Game loop
running = True
clock = pygame.time.Clock()
while running:
    screen.fill(WHITE)
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
    
    # Player movement
    keys = pygame.key.get_pressed()
    if keys[pygame.K_LEFT] and player_x > 0:
        player_x -= player_speed
    if keys[pygame.K_RIGHT] and player_x < WIDTH - player_size:
        player_x += player_speed
    
    # Obstacle movement
    obstacle_y += obstacle_speed
    if obstacle_y > HEIGHT:
        obstacle_y = -obstacle_height
        obstacle_x = random.randint(WIDTH // 2, WIDTH - obstacle_width)
    
    # Collision detection
    if (player_x < obstacle_x + obstacle_width and player_x + player_size > obstacle_x and
        player_y < obstacle_y + obstacle_height and player_y + player_size > obstacle_y):
        print("Game Over!")
        running = False
    
    draw_player(player_x, player_y)
    draw_obstacle(obstacle_x, obstacle_y)
    
    pygame.display.update()
    clock.tick(30)

pygame.quit()
