package oops.Inheritance.InheritanceBook;

class GrandParentBox {
	private double width;
	private double height;
	private double depth;

	// constructor clone of an object:
	GrandParentBox(GrandParentBox ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// constructor used when all dimensions are specified:
	GrandParentBox(double width, double heigth, double depth) {
		this.width = width;
		this.height = heigth;
		this.depth = depth;
	}

	// constructor used when no dimensions are specified:\
	GrandParentBox() {
		width = height = depth = -1;
	}

	// constructor used when cube is created:
	GrandParentBox(double side) {
		width = height = depth = side;
	}

	// compute and return volume:
	double volume() {
		return width * height * depth;
	}
}

//adds weight:
class ParentBoxWeight extends GrandParentBox {
	double weight;

	// constructor clone of an object:
	ParentBoxWeight(ParentBoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	// constructor used when all parameters are specified:
	ParentBoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	// constructor used when no dimensions are specified:
	ParentBoxWeight() {
		super();
		weight = -1;
	}

	// constructor used when cube is created:
	ParentBoxWeight(double side, double weight) {
		super(side);
		this.weight = weight;
	}
}

//adds shipment cost:
class ChildShipmentCost extends ParentBoxWeight {
	double shipmentCost;

	// constructor clone of an object:
	ChildShipmentCost(ChildShipmentCost ob) {
		super(ob);
		shipmentCost = ob.shipmentCost;
	}

	// constructor used when all dimensions are specified:
	ChildShipmentCost(double width, double height, double depth, double weight, double shipmentCost) {
		super(width, height, depth, weight);
		this.shipmentCost = shipmentCost;
	}

	// constructor used when no dimensions are specified:
	ChildShipmentCost() {
		super();
		shipmentCost = -1;
	}

	// constructor used when cube is created:
	ChildShipmentCost(double side, double weight, double shipmentCost) {
		super(side, weight);
		this.shipmentCost = shipmentCost;
	}
}

public class MultilevelHeirarchy {

	public static void main(String[] args) {
		ChildShipmentCost shipment1 = new ChildShipmentCost(10, 20, 15, 10, 3.14);
		ChildShipmentCost shipment2 = new ChildShipmentCost(2, 3, 4, 0.76, 1.28);

		double vol;

		vol = shipment1.volume();
		System.out.println("Volume of shipment1 = " + vol);
		System.out.println("Wight of shipment1 = " + shipment1.weight);
		System.out.println("Cost of shipment1 = $" + shipment1.shipmentCost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2 = " + vol);
		System.out.println("Weight of shipment2 = " + shipment2.weight);
		System.out.println("Cost of shipment2 = $" + shipment2.shipmentCost);
		System.out.println();
	}

}
