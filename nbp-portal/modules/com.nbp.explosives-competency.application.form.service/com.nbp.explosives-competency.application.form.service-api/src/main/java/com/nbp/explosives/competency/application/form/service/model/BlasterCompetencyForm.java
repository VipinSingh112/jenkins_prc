/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the BlasterCompetencyForm service. Represents a row in the &quot;nbp_blaster_competency&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyFormModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormImpl"
)
@ProviderType
public interface BlasterCompetencyForm
	extends BlasterCompetencyFormModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.application.form.service.model.impl.BlasterCompetencyFormImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<BlasterCompetencyForm, Long>
		BLASTER_COMPETENCY_FORM_ID_ACCESSOR =
			new Accessor<BlasterCompetencyForm, Long>() {

				@Override
				public Long get(BlasterCompetencyForm blasterCompetencyForm) {
					return blasterCompetencyForm.getBlasterCompetencyFormId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<BlasterCompetencyForm> getTypeClass() {
					return BlasterCompetencyForm.class;
				}

			};

}