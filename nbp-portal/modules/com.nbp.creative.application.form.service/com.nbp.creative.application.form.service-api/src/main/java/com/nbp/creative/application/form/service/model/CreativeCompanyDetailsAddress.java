/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativeCompanyDetailsAddress service. Represents a row in the &quot;nbp_creative_com_detail_addres&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddressModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressImpl"
)
@ProviderType
public interface CreativeCompanyDetailsAddress
	extends CreativeCompanyDetailsAddressModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeCompanyDetailsAddress, Long>
		CREATIVE_COM_DETAILS_ADDRESS_ID_ACCESSOR =
			new Accessor<CreativeCompanyDetailsAddress, Long>() {

				@Override
				public Long get(
					CreativeCompanyDetailsAddress
						creativeCompanyDetailsAddress) {

					return creativeCompanyDetailsAddress.
						getCreativeComDetailsAddressId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeCompanyDetailsAddress> getTypeClass() {
					return CreativeCompanyDetailsAddress.class;
				}

			};

}