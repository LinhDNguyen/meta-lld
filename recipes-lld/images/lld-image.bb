#Angstrom image to test systemd

require angstrom-image.bb


CONMANPKGS ?= "connman connman-client connman-angstrom-settings connman-plugin-loopback connman-plugin-ethernet connman-plugin-wifi"
CONMANPKGS_libc-uclibc = ""

IMAGE_INSTALL += " \
	${CONMANPKGS} \
"

export IMAGE_BASENAME = "lld-image"

# Add extra space to the rootfs image  
IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 3000000"
