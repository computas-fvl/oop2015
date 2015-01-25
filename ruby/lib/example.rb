module Example

  # Return maximum item
  #
  # A very direct port of com.computas.booster2014.Example.
  # Does intentionally not use rubies core lib / Enumerable features.
  #
  # @param array [Array<#<>]
  #
  # @example
  #
  #   array = [1, 5, 2, 3]
  #   Example.max(array) # => 5
  #
  # @return [nil]
  #   if array is empty
  #
  # @return [Fixnum]
  #   the maximum object from the input array
  #
  # @api private
  def self.max(array)
    m = array[0]
    array.each do |i|
      m = i if larger(i, m)
    end
    m
  end

  # Test if input is larger than another
  #
  # @param i [Fixnum]
  # @param j [Fixnum]
  #
  # @return [Boolean]
  #
  # @api private
  def self.larger(i, j)
    i > j
  end
  private_class_method :larger

end # Example
