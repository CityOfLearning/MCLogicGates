#MCLogicGates [![Build Status](https://travis-ci.org/CityOfLearning/MCLogicGates.svg?branch=1.8.9)](https://travis-ci.org/CityOfLearning/MCLogicGates)

##LOGIC GATES

This mod adds new repeater variants, logic gates, and a new ranged signal type (ender) to Minecraft.

The purpose of this mod is to expand Minecraft's logic blocks and to create an easier, less cluttered method of sending redstone signals through large distances.

Forum: http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2588839-logic-gates

##Features:

- Vertical Repeaters
- Signal Inverters
- 2-3 input gated diodes
- Converters (converts redstone signals to ender and vice versa)
- All diodes have a fixed 1 tick delay
- Most diodes input may be reoriented
- All diodes can be imbued with ender pearls to increase range to 15
- All diodes require basic gate crafting materials

###Recipes


####Gates

#####BUFFER
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/buffer.png "Buffer Gate")

#####NOT
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/not.png "Not Gate")

#####AND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/and3.png "And Gate")

#####OR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/or3.png "Or Gate")

#####XOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xor3.png "Xor Gate")

#####NAND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nand3.png "Nand Gate")

#####NOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nor3.png "Nor Gate")

#####XNOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xnor3.png "Xnor Gate")

####Diodes

#####Repeater
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/repeater.png "Repeater Diodes")

#####Inverter
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/inverter.png "Inverter Diode")

#####Vertical Transmitter
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/vert_trans.png "Vertical Transmitter")

#####Vertical Receiver
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/vert_recv.png "Vertical Reciever")

###Gated Diodes

####2-Input

#####AND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/and2.png "2-Input And")

#####OR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/or2.png "2-Input Or")

#####XOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xor2.png "2-Input Xor")

#####NAND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nand2.png "2-Input Nand")

#####NOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nor2.png "2-Input Nor")

#####XNOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xnor2.png "2-Input Xnor")

####3-Input

#####AND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/and.png "3-Input And")

#####OR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/or.png "3-Input Or")

#####XOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xor.png "3-Input Xor")

#####NAND
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nand.png "3-Input Nand")

#####NOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/nor.png "3-Input Nor")

#####XNOR
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/xnor.png "3-Input Xnor")

###Signals

Ender signals work similar to redstone signals with the added feature of sending up to 15 blocks away without the need for redstone dust. Ender signals cannot be used to power redstone mechanisms (e.g. doors, trapdoors, etc.).

Signal repeaters
Repeats a signal of the same kind
RR - Redstone to redstone
EE - Ender to ender

Signal converters
Converts a signal
RE - Redstone to ender
ER - Ender to redstone

Signal Transmission/Reception
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/trans_recv.gif "Signal Propigation")

(Top left) RR Repeater, (Top right) RE Converter, (Botem left) EE Repeater, (Bottom right) ER Converter

Repeaters/Gates may only receive and transmit signals of the same kind.That is, an Ender Repeater/Gate may only receive a signal from other Ender Repeaters/Gates or a Redstone Converter, and transmit a signal to other Ender Repeaters/Gates or an Ender Converter; and an Redstone Repeater/Gate may only receive a signal from other Redstone Repeaters/Gates or an Ender Converter, and transmit a signal to other Redstone Repeaters/Gates or a Redstone Converter.

RR > RR or RE
EE > EE or ER

Converters may only receive a signal of one kind and transmit a signal of the other kind. That is, an Redstone Converter/Gate may only receive a signal from Redstone Repeaters/Gates or an Ender Converter, and transmit a signal to Ender Repeaters/Gates or an Ender Converter; and an Ender Converter/Gate may only receive a signal from Ender Repeaters/Gates or a Redstone Converter, and transmit a signal to Redstone Repeaters/Gates or a Redstone Converter.

RE > ER or EE
ER > RE or RR

Demo
![alt text](https://raw.githubusercontent.com/Digital-Youth-Network/MCLogicGates/1.8.0/images/demo.gif "Gate Demo")

