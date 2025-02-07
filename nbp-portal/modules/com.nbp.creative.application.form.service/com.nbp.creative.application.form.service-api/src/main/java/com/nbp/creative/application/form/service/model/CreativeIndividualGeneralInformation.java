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
 * The extended model interface for the CreativeIndividualGeneralInformation service. Represents a row in the &quot;nbp_creative_indi_general_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualGeneralInformationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationImpl"
)
@ProviderType
public interface CreativeIndividualGeneralInformation
	extends CreativeIndividualGeneralInformationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.application.form.service.model.impl.CreativeIndividualGeneralInformationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativeIndividualGeneralInformation, Long>
		CREATIVE_INDI_GENERAL_INFO_ID_ACCESSOR =
			new Accessor<CreativeIndividualGeneralInformation, Long>() {

				@Override
				public Long get(
					CreativeIndividualGeneralInformation
						creativeIndividualGeneralInformation) {

					return creativeIndividualGeneralInformation.
						getCreativeIndiGeneralInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CreativeIndividualGeneralInformation>
					getTypeClass() {

					return CreativeIndividualGeneralInformation.class;
				}

			};

}