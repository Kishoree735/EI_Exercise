# Proxy

## Pattern
The Proxy pattern provides a substitute object that controls access to another object.

## Use Case
High-resolution images are slow to load and consume memory.  
A proxy can load the real image only when needed.

## What It Solves
Improves performance and resource usage by delaying creation of heavy objects.

## Structure
- `Image` → Common interface.  
- `HighResolutionImage` → Real subject that loads the full image.  
- `ImageProxy` → Controls access, loads real image on demand.  
- `ProxyDemo` → Demonstrates lazy loading.

## What Each Class Does
- **Image** → Interface to display images.  
- **HighResolutionImage** → Loads and displays actual image.  
- **ImageProxy** → Acts as placeholder, loads real image when needed.  
- **ProxyDemo** → Shows usage of proxy for lazy loading.

