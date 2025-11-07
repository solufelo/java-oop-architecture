# Git Quick Reference

## 🚀 Most Common Commands

```bash
# Check status (use this often!)
git status

# Add all changes
git add .

# Add specific file
git add filename.cpp

# Commit changes
git commit -m "Your descriptive message"

# Push to GitHub
git push

# Pull from GitHub
git pull

# View history
git log --oneline
```

## 📝 Good Commit Message Examples

### For Course Exercises:
```
"Complete: Section 1 - Hello World program"
"Add: Variables and data types exercises"
"Implement: Bubble sort algorithm"
"Complete: Simple Task 03 - Word counter"
"Add: Template functions examples"
```

### For Game Project:
```
"Setup: Light Years game project structure"
"Add: Actor class with rendering"
"Implement: Player input and movement"
"Add: Shooting mechanics and bullets"
"Implement: Health system and damage"
"Add: Particle effects for explosions"
"Fix: Player boundary collision bug"
"Optimize: Physics update loop"
```

### General Format:
- **Add:** New feature or file
- **Update:** Modify existing code
- **Fix:** Bug fix
- **Complete:** Finish a section/exercise
- **Implement:** Add new functionality
- **Refactor:** Code restructuring
- **Setup:** Initial configuration
- **WIP:** Work in progress (for partial changes)

## 🔄 Common Workflows

### Starting Your Day:
```bash
git pull                           # Get latest changes
```

### After Each Exercise/Section:
```bash
git status                         # See what changed
git add .                          # Stage changes
git commit -m "Complete: lesson"   # Commit with message
git push                           # Backup to GitHub
```

### Before Breaking from Coding:
```bash
git add .
git commit -m "WIP: working on [feature]"
git push
```

## 🌿 Branching (Optional but Useful)

```bash
# Create branch for experiments
git checkout -b experiment-feature

# Work on the branch...

# Switch back to main
git checkout main

# Merge if you like the changes
git merge experiment-feature

# Delete branch if done
git branch -d experiment-feature
```

## 🆘 Emergency Commands

### Undo Changes (before commit):
```bash
git checkout -- filename.cpp        # Undo specific file
git checkout -- .                   # Undo all changes
```

### Undo Last Commit (keep changes):
```bash
git reset --soft HEAD~1
```

### See What Changed:
```bash
git diff                           # Show all changes
git diff filename.cpp              # Changes in specific file
```

### View Commit History:
```bash
git log --oneline                  # Compact view
git log --graph --oneline          # Visual branch view
git log -5                         # Last 5 commits
```

## 🎯 Tips for This Course

1. **Commit after each lecture** you complete
2. **Push daily** to backup your work
3. **Use branches** for experimental code
4. **Write descriptive messages** - your future self will thank you!
5. **Don't commit** .exe or build files (already in .gitignore)

## 📊 Tracking Progress

Update README.md checkboxes as you progress:
```markdown
- [x] Completed section
- [ ] Not started
- [⏳] In progress (optional)
```

Then commit:
```bash
git add README.md
git commit -m "Update: Progress tracking in README"
git push
```

---

**Remember:** Commit early, commit often! 🎓

