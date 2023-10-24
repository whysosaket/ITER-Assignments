original_prices = [4.95, 9.95, 14.95, 19.95, 24.95]
discount_rate = 0.60

print("Original Price  |  Discount Amount  |  New Price")
print("-" * 60)

for price in original_prices:
    discount_amount = price * discount_rate
    new_price = price - discount_amount
    print(f"${price:.2f}               ${discount_amount:.2f}                ${new_price:.2f}")
