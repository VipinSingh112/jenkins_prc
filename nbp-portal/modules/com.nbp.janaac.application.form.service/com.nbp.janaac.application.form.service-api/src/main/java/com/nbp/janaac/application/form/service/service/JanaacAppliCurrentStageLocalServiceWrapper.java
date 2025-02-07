/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JanaacAppliCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacAppliCurrentStageLocalService
 * @generated
 */
public class JanaacAppliCurrentStageLocalServiceWrapper
	implements JanaacAppliCurrentStageLocalService,
			   ServiceWrapper<JanaacAppliCurrentStageLocalService> {

	public JanaacAppliCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public JanaacAppliCurrentStageLocalServiceWrapper(
		JanaacAppliCurrentStageLocalService
			janaacAppliCurrentStageLocalService) {

		_janaacAppliCurrentStageLocalService =
			janaacAppliCurrentStageLocalService;
	}

	/**
	 * Adds the janaac appli current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
		addJanaacAppliCurrentStage(
			com.nbp.janaac.application.form.service.model.
				JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return _janaacAppliCurrentStageLocalService.addJanaacAppliCurrentStage(
			janaacAppliCurrentStage);
	}

	/**
	 * Creates a new janaac appli current stage with the primary key. Does not add the janaac appli current stage to the database.
	 *
	 * @param janaacAppliCurrentStageId the primary key for the new janaac appli current stage
	 * @return the new janaac appli current stage
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
		createJanaacAppliCurrentStage(long janaacAppliCurrentStageId) {

		return _janaacAppliCurrentStageLocalService.
			createJanaacAppliCurrentStage(janaacAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacAppliCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the janaac appli current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
		deleteJanaacAppliCurrentStage(
			com.nbp.janaac.application.form.service.model.
				JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return _janaacAppliCurrentStageLocalService.
			deleteJanaacAppliCurrentStage(janaacAppliCurrentStage);
	}

	/**
	 * Deletes the janaac appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage that was removed
	 * @throws PortalException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
			deleteJanaacAppliCurrentStage(long janaacAppliCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacAppliCurrentStageLocalService.
			deleteJanaacAppliCurrentStage(janaacAppliCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacAppliCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _janaacAppliCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _janaacAppliCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _janaacAppliCurrentStageLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _janaacAppliCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _janaacAppliCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _janaacAppliCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _janaacAppliCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _janaacAppliCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
		fetchJanaacAppliCurrentStage(long janaacAppliCurrentStageId) {

		return _janaacAppliCurrentStageLocalService.
			fetchJanaacAppliCurrentStage(janaacAppliCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _janaacAppliCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _janaacAppliCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
			getJanaac_Stage_JAI(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacAppliCurrentStageException {

		return _janaacAppliCurrentStageLocalService.getJanaac_Stage_JAI(
			janaacApplicationId);
	}

	/**
	 * Returns the janaac appli current stage with the primary key.
	 *
	 * @param janaacAppliCurrentStageId the primary key of the janaac appli current stage
	 * @return the janaac appli current stage
	 * @throws PortalException if a janaac appli current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
			getJanaacAppliCurrentStage(long janaacAppliCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacAppliCurrentStageLocalService.getJanaacAppliCurrentStage(
			janaacAppliCurrentStageId);
	}

	/**
	 * Returns a range of all the janaac appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.JanaacAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac appli current stages
	 * @param end the upper bound of the range of janaac appli current stages (not inclusive)
	 * @return the range of janaac appli current stages
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage>
			getJanaacAppliCurrentStages(int start, int end) {

		return _janaacAppliCurrentStageLocalService.getJanaacAppliCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of janaac appli current stages.
	 *
	 * @return the number of janaac appli current stages
	 */
	@Override
	public int getJanaacAppliCurrentStagesCount() {
		return _janaacAppliCurrentStageLocalService.
			getJanaacAppliCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _janaacAppliCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _janaacAppliCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the janaac appli current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacAppliCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacAppliCurrentStage the janaac appli current stage
	 * @return the janaac appli current stage that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.JanaacAppliCurrentStage
		updateJanaacAppliCurrentStage(
			com.nbp.janaac.application.form.service.model.
				JanaacAppliCurrentStage janaacAppliCurrentStage) {

		return _janaacAppliCurrentStageLocalService.
			updateJanaacAppliCurrentStage(janaacAppliCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _janaacAppliCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public JanaacAppliCurrentStageLocalService getWrappedService() {
		return _janaacAppliCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		JanaacAppliCurrentStageLocalService
			janaacAppliCurrentStageLocalService) {

		_janaacAppliCurrentStageLocalService =
			janaacAppliCurrentStageLocalService;
	}

	private JanaacAppliCurrentStageLocalService
		_janaacAppliCurrentStageLocalService;

}