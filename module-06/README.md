# Module 6 - Memory and Storage Management

## Overview

Short paper on how **Draw It or Lose It** should handle memory and storage as it scales across platforms.

## Summary

* **Memory management:** keep the current image and the next image in RAM, preload one step ahead, release memory at the end of each round, watch for leaks to keep frame rate steady.
* **Storage planning:** start from about 1.6 gigabytes for 200 high-definition images, add web-ready sizes and thumbnails, store originals in durable storage, serve via a CDN, and use backups and lifecycle rules.
* **Difference:** memory is short-term working space for speed during play, storage is long-term space for the full image library, game data, and backups.
