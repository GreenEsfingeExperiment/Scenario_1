# 🛒 Product Recommendation System – Greensfinge Experiment

This project simulates a simplified product recommendation system, commonly found in e-commerce platforms. It is part of an experiment designed to demonstrate how energy-saving strategies can be integrated into Java applications **without** using the **Greensfinge Framework**.

## 📦 Project Structure

The project follows the standard layered architecture with separate packages for service, entity and repository.

## ✅ Description

- `entity.Recommendation`: Contains the business entity class.
- `service.RecommendationService`: Contains the business logic to format a recommendation.
- `repository.RecommendationRepository`: Simulates a database to search the values.

### ❓ Remember the Task

The search for the product and the number of visits is always mandatory, but the search for the "other product" is optional — so how can we ignore the execution to find the other product without actually invoking the business logic method?

---

## 🧪 Unit Tests

The test class `RecommendationServiceTest` validates the behavior of the recommendation logic.

In this task, you will see something like this, and the goal is to make all tests pass successfully.

> But remember, this applies only to finding the other product.

![img.png](img.png)