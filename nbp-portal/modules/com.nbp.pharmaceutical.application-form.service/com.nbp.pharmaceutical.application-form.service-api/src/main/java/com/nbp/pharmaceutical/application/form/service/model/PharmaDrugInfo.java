/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaDrugInfo service. Represents a row in the &quot;nbp_pharma_drug_Info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaDrugInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoImpl"
)
@ProviderType
public interface PharmaDrugInfo extends PersistedModel, PharmaDrugInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDrugInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaDrugInfo, Long>
		PHARMA_DRUG_INFO_ID_ACCESSOR = new Accessor<PharmaDrugInfo, Long>() {

			@Override
			public Long get(PharmaDrugInfo pharmaDrugInfo) {
				return pharmaDrugInfo.getPharmaDrugInfoId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PharmaDrugInfo> getTypeClass() {
				return PharmaDrugInfo.class;
			}

		};

}