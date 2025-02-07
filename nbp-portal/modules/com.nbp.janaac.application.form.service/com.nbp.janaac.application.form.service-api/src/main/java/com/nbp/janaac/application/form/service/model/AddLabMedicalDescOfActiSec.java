/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AddLabMedicalDescOfActiSec service. Represents a row in the &quot;nbp_janaac_add_lab_med_dec_sec&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalDescOfActiSecModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecImpl"
)
@ProviderType
public interface AddLabMedicalDescOfActiSec
	extends AddLabMedicalDescOfActiSecModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalDescOfActiSecImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddLabMedicalDescOfActiSec, Long>
		ADD_LAB_MEDICAL_DESC_OF_ACTI_SEC_ID_ACCESSOR =
			new Accessor<AddLabMedicalDescOfActiSec, Long>() {

				@Override
				public Long get(
					AddLabMedicalDescOfActiSec addLabMedicalDescOfActiSec) {

					return addLabMedicalDescOfActiSec.
						getAddLabMedicalDescOfActiSecId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddLabMedicalDescOfActiSec> getTypeClass() {
					return AddLabMedicalDescOfActiSec.class;
				}

			};

}