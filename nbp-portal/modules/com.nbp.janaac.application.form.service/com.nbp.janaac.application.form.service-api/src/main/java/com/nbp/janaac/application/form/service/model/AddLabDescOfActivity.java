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
 * The extended model interface for the AddLabDescOfActivity service. Represents a row in the &quot;nbp_janaac_add_lab_des_of_act&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabDescOfActivityModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityImpl"
)
@ProviderType
public interface AddLabDescOfActivity
	extends AddLabDescOfActivityModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AddLabDescOfActivity, Long>
		ADD_LAB_DESC_OF_ACTIVITY_ID_ACCESSOR =
			new Accessor<AddLabDescOfActivity, Long>() {

				@Override
				public Long get(AddLabDescOfActivity addLabDescOfActivity) {
					return addLabDescOfActivity.getAddLabDescOfActivityId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AddLabDescOfActivity> getTypeClass() {
					return AddLabDescOfActivity.class;
				}

			};

}