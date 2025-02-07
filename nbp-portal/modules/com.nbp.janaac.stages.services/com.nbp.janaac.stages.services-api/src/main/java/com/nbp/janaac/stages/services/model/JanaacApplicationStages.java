/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JanaacApplicationStages service. Represents a row in the &quot;nbp_janaac_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesImpl"
)
@ProviderType
public interface JanaacApplicationStages
	extends JanaacApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.stages.services.model.impl.JanaacApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JanaacApplicationStages, Long>
		JANAAC_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<JanaacApplicationStages, Long>() {

				@Override
				public Long get(
					JanaacApplicationStages janaacApplicationStages) {

					return janaacApplicationStages.
						getJanaacApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JanaacApplicationStages> getTypeClass() {
					return JanaacApplicationStages.class;
				}

			};

}