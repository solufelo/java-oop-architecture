# Setup Guide for C++ Course Repository

## 🔧 Prerequisites Installation

### 1. Install Git

**Download Git for Windows:**
- Visit: https://git-scm.com/download/win
- Download and run the installer
- Use default settings (recommended)
- **Important:** Make sure "Git from the command line and also from 3rd-party software" is selected

**Verify Installation:**
```bash
git --version
```

### 2. Create GitHub Account
- Go to https://github.com
- Sign up for a free account if you don't have one
- Verify your email address

### 3. Configure Git (First Time Setup)
```bash
# Set your name
git config --global user.name "Solomon Olufelo"

# Set your email
git config --global user.email "oluf9170@mylaurier.ca"

# Check configuration
git config --list
```

## 🚀 Setting Up This Repository

### Step 1: Initialize Git (after installing Git)
```bash
cd C:\Users\solom\cpp
git init
```

### Step 2: Add Files to Git
```bash
# Add all files
git add .

# Check status
git status
```

### Step 3: Make First Commit
```bash
git commit -m "Initial commit: Setup C++ course repository"
```

### Step 4: Create GitHub Repository
1. Go to https://github.com/new
2. Repository name: `cpp-game-dev-course` (or your preferred name)
3. Description: "C++ Game Development Course - Learning fundamentals, OOP, and building a game"
4. Keep it **Public** (or Private if you prefer)
5. **DO NOT** initialize with README (we already have one)
6. Click "Create repository"

### Step 5: Connect to GitHub and Push
```bash
# Add GitHub as remote (replace YOUR_USERNAME with your GitHub username)
git remote add origin https://github.com/YOUR_USERNAME/cpp-game-dev-course.git

# Verify remote
git remote -v

# Push to GitHub
git branch -M main
git push -u origin main
```

## 📋 Daily Git Workflow

### After Making Changes:
```bash
# See what changed
git status

# Add changes
git add .

# Or add specific files
git add filename.cpp

# Commit with descriptive message
git commit -m "Complete lesson: Variables and Arrays"

# Push to GitHub
git push
```

### Useful Git Commands:
```bash
# View commit history
git log --oneline

# See differences
git diff

# Undo changes (before commit)
git checkout -- filename.cpp

# Create a new branch for experiments
git checkout -b experiment-branch

# Switch back to main
git checkout main
```

## 📂 Organizing Your Work

### Recommended workflow:
1. **Each section** goes in its appropriate folder
2. **Each major lesson** could be a separate commit
3. **Game project** gets its own commits as you progress

### Example commit messages:
- `"Add: Hello World program to fundamentals"`
- `"Complete: Variables and array exercises"`
- `"Implement: Bubble sort algorithm"`
- `"Add: Smart pointers examples"`
- `"WIP: Light Years game - Actor class setup"`
- `"Complete: Light Years game - Health system"`

## 🎯 GitHub Best Practices

### DO:
- ✅ Commit frequently (after completing each exercise/lesson)
- ✅ Write clear commit messages
- ✅ Push regularly to backup your work
- ✅ Use .gitignore to exclude build files (.exe, .obj, etc.)

### DON'T:
- ❌ Commit compiled files (.exe, .dll, .obj)
- ❌ Commit IDE-specific files (.vs/, .vscode/)
- ❌ Use vague messages like "update" or "fix"
- ❌ Commit large binary files

## 🆘 Troubleshooting

### "Git is not recognized"
- Restart your terminal/VS Code after installing Git
- Check if Git is in your PATH: `$env:Path -split ';' | Select-String git`
- Reinstall Git if needed

### "Permission denied (publickey)"
- Use HTTPS instead of SSH: `https://github.com/username/repo.git`
- Or set up SSH keys: https://docs.github.com/en/authentication

### "Failed to push"
- Make sure you're connected: `git remote -v`
- Pull first if repository exists: `git pull origin main`
- Check your internet connection

## 📚 Additional Resources

- **Git Cheat Sheet:** https://education.github.com/git-cheat-sheet-education.pdf
- **GitHub Docs:** https://docs.github.com/en
- **Git Visual Guide:** https://marklodato.github.io/visual-git-guide/index-en.html
- **Course Git Section:** Reference lecture sections 61-69 in the course

## 🎓 Academic Integrity Note

This repository is for **personal learning and portfolio purposes**. When sharing:
- ✅ Share to demonstrate your learning progress
- ✅ Use for job applications and portfolios
- ❌ Don't share solutions with other students taking the same course
- ❌ Don't directly copy if this is graded coursework

---

**Next Steps:**
1. Install Git
2. Run the commands in "Setting Up This Repository" section
3. Start coding and committing your progress!
4. Check the README.md for course organization

Good luck with your C++ journey! 🚀

