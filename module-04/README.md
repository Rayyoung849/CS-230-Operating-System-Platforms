# Module 4 - Game Player Management App and Journal

## Overview

Server side REST API with Basic Authentication, plus a short client and server journal. Goal is to show how one backend can serve multiple platforms through a simple, consistent API.

## Game Player Management App

* Framework: Dropwizard REST API with roles ADMIN and USER
* Endpoints: /gameusers and /gameusers/{id}
* How to run: import the Maven project, run with server config.yml, open [http://localhost:8080/gameusers](http://localhost:8080/gameusers), sign in with guest, user, player, or admin, password is password
* What it shows: protected routes, role based access, and JSON responses any client can use

## Journal

* Client server pattern supports multiple platforms and lets client and server evolve independently
* Server side exposes REST endpoints with auth and roles, returns lightweight JSON
* Next steps: add users to the database, plan new features, and outline changes to support more clients like Xbox or PS4

## Note

I covered server side security well. To improve, I could give more concrete benefits of the client server pattern and compare client platform differences in more depth.

## Files

* app folder with the Dropwizard project
* journal folder with module 04 journal document
* README.md
