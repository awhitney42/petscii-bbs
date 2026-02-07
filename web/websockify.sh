#!/bin/bash

sudo websockify --cert=/etc/letsencrypt/live/localhost/fullchain.pem 2401 --key=/etc/letsencrypt/live/localhost/privkey.pem 127.0.0.1:2400

