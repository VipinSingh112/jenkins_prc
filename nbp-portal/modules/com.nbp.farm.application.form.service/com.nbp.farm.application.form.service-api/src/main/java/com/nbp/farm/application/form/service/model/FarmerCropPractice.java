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
 * The extended model interface for the FarmerCropPractice service. Represents a row in the &quot;farmer_crop_practice&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPracticeModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeImpl"
)
@ProviderType
public interface FarmerCropPractice
	extends FarmerCropPracticeModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FarmerCropPractice, Long>
		FARMER_CROP_PRACTICE_ID_ACCESSOR =
			new Accessor<FarmerCropPractice, Long>() {

				@Override
				public Long get(FarmerCropPractice farmerCropPractice) {
					return farmerCropPractice.getFarmerCropPracticeId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FarmerCropPractice> getTypeClass() {
					return FarmerCropPractice.class;
				}

			};

}