# Module 7 - Project Three

## Overview

This module wraps up the full software design for Draw It or Lose It. The goal was to make a clear recommendation for how the game should run across platforms and scale for real players, not just on Android. The final version of the design document includes the executive summary, requirements, domain model, evaluation of Mac/Linux/Windows/mobile, and the full recommendations section.

## What I delivered

* Completed software design document for The Gaming Room
* Final recommendations on platform, storage, memory, networking, and security

## Key points from the Recommendations section

* **Platform**: Use Linux as the main server platform. It is stable, cost-effective, and scales well on cloud providers.
* **Architecture**: Use a three-tier layout (load balancer, app layer, database) and keep the app layer stateless so any server can handle any player.
* **Storage**: Store the game’s image library in object storage (with backups and lifecycle rules) and serve it through a CDN for faster delivery.
* **Memory**: Only keep the current and next image in memory, preload one round ahead, and release memory at the end of each round to keep performance smooth.
* **Distributed systems**: Run multiple app instances behind HTTPS with health checks, retries, and real-time communication so that players stay in sync.
* **Security**: Protect player data with encryption in transit and at rest, role-based access, safe password handling, and regular updates.

## Files

* software-design-document.docx
* README.md
