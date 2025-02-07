/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JtbApplicationStages service. Represents a row in the &quot;nbp_jtb_app_stage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesImpl"
)
@ProviderType
public interface JtbApplicationStages
	extends JtbApplicationStagesModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jtb.application.stage.services.model.impl.JtbApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JtbApplicationStages, Long>
		JTB_APPLICATION_STAGES_ID_ACCESSOR =
			new Accessor<JtbApplicationStages, Long>() {

				@Override
				public Long get(JtbApplicationStages jtbApplicationStages) {
					return jtbApplicationStages.getJtbApplicationStagesId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JtbApplicationStages> getTypeClass() {
					return JtbApplicationStages.class;
				}

			};

}