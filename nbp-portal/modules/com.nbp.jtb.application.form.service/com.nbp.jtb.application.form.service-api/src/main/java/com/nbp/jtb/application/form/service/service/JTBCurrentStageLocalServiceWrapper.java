/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JTBCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JTBCurrentStageLocalService
 * @generated
 */
public class JTBCurrentStageLocalServiceWrapper
	implements JTBCurrentStageLocalService,
			   ServiceWrapper<JTBCurrentStageLocalService> {

	public JTBCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public JTBCurrentStageLocalServiceWrapper(
		JTBCurrentStageLocalService jtbCurrentStageLocalService) {

		_jtbCurrentStageLocalService = jtbCurrentStageLocalService;
	}

	/**
	 * Adds the jtb current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
		addJTBCurrentStage(
			com.nbp.jtb.application.form.service.model.JTBCurrentStage
				jtbCurrentStage) {

		return _jtbCurrentStageLocalService.addJTBCurrentStage(jtbCurrentStage);
	}

	/**
	 * Creates a new jtb current stage with the primary key. Does not add the jtb current stage to the database.
	 *
	 * @param jTBCurrentStageId the primary key for the new jtb current stage
	 * @return the new jtb current stage
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
		createJTBCurrentStage(long jTBCurrentStageId) {

		return _jtbCurrentStageLocalService.createJTBCurrentStage(
			jTBCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbCurrentStageLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the jtb current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
		deleteJTBCurrentStage(
			com.nbp.jtb.application.form.service.model.JTBCurrentStage
				jtbCurrentStage) {

		return _jtbCurrentStageLocalService.deleteJTBCurrentStage(
			jtbCurrentStage);
	}

	/**
	 * Deletes the jtb current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage that was removed
	 * @throws PortalException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
			deleteJTBCurrentStage(long jTBCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbCurrentStageLocalService.deleteJTBCurrentStage(
			jTBCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbCurrentStageLocalService.dynamicQuery();
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

		return _jtbCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
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

		return _jtbCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
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

		return _jtbCurrentStageLocalService.dynamicQuery(
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

		return _jtbCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jtbCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
		fetchJTBCurrentStage(long jTBCurrentStageId) {

		return _jtbCurrentStageLocalService.fetchJTBCurrentStage(
			jTBCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
			getByJTB_Stage(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBCurrentStageException {

		return _jtbCurrentStageLocalService.getByJTB_Stage(jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb current stage with the primary key.
	 *
	 * @param jTBCurrentStageId the primary key of the jtb current stage
	 * @return the jtb current stage
	 * @throws PortalException if a jtb current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
			getJTBCurrentStage(long jTBCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbCurrentStageLocalService.getJTBCurrentStage(
			jTBCurrentStageId);
	}

	/**
	 * Returns a range of all the jtb current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb current stages
	 * @param end the upper bound of the range of jtb current stages (not inclusive)
	 * @return the range of jtb current stages
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JTBCurrentStage>
			getJTBCurrentStages(int start, int end) {

		return _jtbCurrentStageLocalService.getJTBCurrentStages(start, end);
	}

	/**
	 * Returns the number of jtb current stages.
	 *
	 * @return the number of jtb current stages
	 */
	@Override
	public int getJTBCurrentStagesCount() {
		return _jtbCurrentStageLocalService.getJTBCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the jtb current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbCurrentStage the jtb current stage
	 * @return the jtb current stage that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JTBCurrentStage
		updateJTBCurrentStage(
			com.nbp.jtb.application.form.service.model.JTBCurrentStage
				jtbCurrentStage) {

		return _jtbCurrentStageLocalService.updateJTBCurrentStage(
			jtbCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public JTBCurrentStageLocalService getWrappedService() {
		return _jtbCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		JTBCurrentStageLocalService jtbCurrentStageLocalService) {

		_jtbCurrentStageLocalService = jtbCurrentStageLocalService;
	}

	private JTBCurrentStageLocalService _jtbCurrentStageLocalService;

}