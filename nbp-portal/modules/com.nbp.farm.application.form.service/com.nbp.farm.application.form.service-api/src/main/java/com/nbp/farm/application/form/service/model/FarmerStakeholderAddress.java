/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FarmerStakeholderAddress service. Represents a row in the &quot;farmer_stakeholder_address&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressImpl"
)
@ProviderType
public interface FarmerStakeholderAddress
	extends FarmerStakeholderAddressModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FarmerStakeholderAddress, Long>
		FARMER_STAKEHOLDER_ADDRESS_ID_ACCESSOR =
			new Accessor<FarmerStakeholderAddress, Long>() {

				@Override
				public Long get(
					FarmerStakeholderAddress farmerStakeholderAddress) {

					return farmerStakeholderAddress.
						getFarmerStakeholderAddressId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FarmerStakeholderAddress> getTypeClass() {
					return FarmerStakeholderAddress.class;
				}

			};

}