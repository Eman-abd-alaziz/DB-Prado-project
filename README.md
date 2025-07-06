# 🌟 Prado Company - Data Architecture Blueprint

> “Organizing complexity into elegant systems — one exhibition at a time.”

---

## 🏢 Company Overview

Welcome to **Prado Company**, a dynamic organization operating through a network of **exhibitions** and **stores** — connecting **people**, **products**, and **places**.

Our mission is to manage a seamless flow of **imported goods**, enhance the experience of our **customers**, and empower our **employees** across every layer of our operations.

---

## 🧭 Core Entities & Relationships

### 🖼️ Exhibitions
Each **Exhibition** is the centerpiece of our business:
- 📍 One unique **location**
- 🔢 A **unique ID**
- 👥 Managed by **one employee** (with a `start_date`)
- 🧑‍🤝‍🧑 Hosts a **team of employees**
- 📦 Displays a **collection of goods**
- 🏬 Connected to **multiple stores**

---

### 🏬 Stores
Our **Stores** are the beating heart of operations:
- 🆔 **Unique store number**
- 🏠 A **specific address** and **internal location**
- 📛 **Store name**
- 👷‍♂️ Managed by **one employee**
- 👨‍🔧 Staffed with **multiple employees**
- 📦 Supplies **ready-made or component goods** to exhibitions

---

### 👨‍💼 Employees
Every **Employee** brings value to either a store or an exhibition:
- 🧑 Full **name**
- 🆔 **Social Security Number (SSN)**
- 🏠 **Address**
- 💸 **Salary**
- 🎂 **Date of birth**
- 📱 One or more **mobile numbers**
- 📍 Assigned to **either** one store **or** one exhibition

---

### 📦 Goods
We manage a vibrant collection of goods imported from around the globe:
- 🔢 **Unique product ID**
- 📝 **Name**
- 🎨 **Design**
- 💰 **Price**
- 🌈 **Color**
- 🌍 **Imported from multiple countries**
- 🏬 Stored initially in a **store**, then supplied to exhibitions

---

### 👥 Customers
Our customers are at the center of everything:
- 🆔 **Unique customer ID**
- 🧑 Full **name**
- 📞 One or more **phone numbers**
- 🏠 **Delivery address**
- 🏦 **Bank number** (for payment)
- 📅 **Date of purchase**
- 🛒 Purchase decisions are influenced by:
  - Design
  - Color
  - Import country
  - Specific needs

---

## 🔗 Entity Relationship Highlights

| Entity       | Relationship                            | Entity       |
|--------------|------------------------------------------|--------------|
| Exhibition   | has many                                 | Stores       |
| Exhibition   | has many                                 | Employees    |
| Exhibition   | has many                                 | Goods        |
| Store        | has many                                 | Employees    |
| Store        | supplies many                            | Goods        |
| Employee     | works at one                             | Store/Exhibition |
| Customer     | purchases                                | Goods        |

---

## 🚀 Designed For

This data structure can fuel the development of:
- 🧾 Inventory and supply chain systems
- 👩‍💼 Employee and HR management tools
- 🧠 Business intelligence dashboards
- 🛍️ E-commerce and CRM integrations

---

## 🧠 Final Thought

> Data isn't just information — it's the backbone of intelligent business.

With this design, **Prado Company** is equipped to scale, adapt, and serve.

---

📁 **Filename:** `README.md`  
🕓 **Last Updated:** July 2025  
🔒 **Confidential — Internal Use Only**

