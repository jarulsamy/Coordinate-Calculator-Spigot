# Coordinate Calculator Spigot Plugin

A simple plugin to convert coordinates without leaving minecraft.

## Installation

1. Download the jar file from the releases page.

2. Copy the downloaded file into your spigot plugins folder.

## Usage

### List of commands

| Command | Arguments| Description |
|:------ | :--- |:----------|
| /coords | None| Get the player's current coordinates in all dimensions|
| /toNether | x y z| Convert provided values to nether coordinates assuming they are from the overworld|
| /toOverworld | x y z| Convert provided values to overworld coordinates assuming they are from the nether|

### Example Usage

/coords

```
/coords
```

```
Overworld
X: 80 Y: 60 Z: 80

Nether
X: 10 Y: 60 Z: 10 
```

/toNether

```
/toNether 80 60 80
```

```
Nether
X: 10 Y: 60 Z:10
```

/toOverworld

```
/toNether 10 60 10
```

```
Overworld
X: 80 Y: 60 Z:80
```

