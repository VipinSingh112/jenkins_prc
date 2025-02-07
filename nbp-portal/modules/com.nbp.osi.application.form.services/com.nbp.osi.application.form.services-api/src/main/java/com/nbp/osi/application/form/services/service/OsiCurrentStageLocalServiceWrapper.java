/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStageLocalService
 * @generated
 */
public class OsiCurrentStageLocalServiceWrapper
	implements OsiCurrentStageLocalService,
			   ServiceWrapper<OsiCurrentStageLocalService> {

	public OsiCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public OsiCurrentStageLocalServiceWrapper(
		OsiCurrentStageLocalService osiCurrentStageLocalService) {

		_osiCurrentStageLocalService = osiCurrentStageLocalService;
	}

	/**
	 * Adds the osi current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStage the osi current stage
	 * @return the osi current stage that was added
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
		addOsiCurrentStage(
			com.nbp.osi.application.form.services.model.OsiCurrentStage
				osiCurrentStage) {

		return _osiCurrentStageLocalService.addOsiCurrentStage(osiCurrentStage);
	}

	/**
	 * Creates a new osi current stage with the primary key. Does not add the osi current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi current stage
	 * @return the new osi current stage
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
		createOsiCurrentStage(long osiCurrentStageId) {

		return _osiCurrentStageLocalService.createOsiCurrentStage(
			osiCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiCurrentStageLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the osi current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage that was removed
	 * @throws PortalException if a osi current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
			deleteOsiCurrentStage(long osiCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiCurrentStageLocalService.deleteOsiCurrentStage(
			osiCurrentStageId);
	}

	/**
	 * Deletes the osi current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStage the osi current stage
	 * @return the osi current stage that was removed
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
		deleteOsiCurrentStage(
			com.nbp.osi.application.form.services.model.OsiCurrentStage
				osiCurrentStage) {

		return _osiCurrentStageLocalService.deleteOsiCurrentStage(
			osiCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiCurrentStageLocalService.dynamicQuery();
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

		return _osiCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiCurrentStageModelImpl</code>.
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

		return _osiCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiCurrentStageModelImpl</code>.
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

		return _osiCurrentStageLocalService.dynamicQuery(
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

		return _osiCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _osiCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
		fetchOsiCurrentStage(long osiCurrentStageId) {

		return _osiCurrentStageLocalService.fetchOsiCurrentStage(
			osiCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi current stage with the primary key.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage
	 * @throws PortalException if a osi current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
			getOsiCurrentStage(long osiCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiCurrentStageLocalService.getOsiCurrentStage(
			osiCurrentStageId);
	}

	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
			getOsiCurrentStageById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiCurrentStageException {

		return _osiCurrentStageLocalService.getOsiCurrentStageById(
			osiApplicationId);
	}

	/**
	 * Returns a range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.application.form.services.model.impl.OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @return the range of osi current stages
	 */
	@Override
	public java.util.List
		<com.nbp.osi.application.form.services.model.OsiCurrentStage>
			getOsiCurrentStages(int start, int end) {

		return _osiCurrentStageLocalService.getOsiCurrentStages(start, end);
	}

	/**
	 * Returns the number of osi current stages.
	 *
	 * @return the number of osi current stages
	 */
	@Override
	public int getOsiCurrentStagesCount() {
		return _osiCurrentStageLocalService.getOsiCurrentStagesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiCurrentStage the osi current stage
	 * @return the osi current stage that was updated
	 */
	@Override
	public com.nbp.osi.application.form.services.model.OsiCurrentStage
		updateOsiCurrentStage(
			com.nbp.osi.application.form.services.model.OsiCurrentStage
				osiCurrentStage) {

		return _osiCurrentStageLocalService.updateOsiCurrentStage(
			osiCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public OsiCurrentStageLocalService getWrappedService() {
		return _osiCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		OsiCurrentStageLocalService osiCurrentStageLocalService) {

		_osiCurrentStageLocalService = osiCurrentStageLocalService;
	}

	private OsiCurrentStageLocalService _osiCurrentStageLocalService;

}