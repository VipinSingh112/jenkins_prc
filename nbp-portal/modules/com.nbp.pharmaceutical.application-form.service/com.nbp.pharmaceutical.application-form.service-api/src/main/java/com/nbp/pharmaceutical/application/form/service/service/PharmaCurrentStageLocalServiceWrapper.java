/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PharmaCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStageLocalService
 * @generated
 */
public class PharmaCurrentStageLocalServiceWrapper
	implements PharmaCurrentStageLocalService,
			   ServiceWrapper<PharmaCurrentStageLocalService> {

	public PharmaCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public PharmaCurrentStageLocalServiceWrapper(
		PharmaCurrentStageLocalService pharmaCurrentStageLocalService) {

		_pharmaCurrentStageLocalService = pharmaCurrentStageLocalService;
	}

	/**
	 * Adds the pharma current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 * @return the pharma current stage that was added
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			addPharmaCurrentStage(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCurrentStage pharmaCurrentStage) {

		return _pharmaCurrentStageLocalService.addPharmaCurrentStage(
			pharmaCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new pharma current stage with the primary key. Does not add the pharma current stage to the database.
	 *
	 * @param pharmaCurrentStageId the primary key for the new pharma current stage
	 * @return the new pharma current stage
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			createPharmaCurrentStage(long pharmaCurrentStageId) {

		return _pharmaCurrentStageLocalService.createPharmaCurrentStage(
			pharmaCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the pharma current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage that was removed
	 * @throws PortalException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
				deletePharmaCurrentStage(long pharmaCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCurrentStageLocalService.deletePharmaCurrentStage(
			pharmaCurrentStageId);
	}

	/**
	 * Deletes the pharma current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 * @return the pharma current stage that was removed
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			deletePharmaCurrentStage(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCurrentStage pharmaCurrentStage) {

		return _pharmaCurrentStageLocalService.deletePharmaCurrentStage(
			pharmaCurrentStage);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _pharmaCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _pharmaCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pharmaCurrentStageLocalService.dynamicQuery();
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

		return _pharmaCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageModelImpl</code>.
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

		return _pharmaCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageModelImpl</code>.
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

		return _pharmaCurrentStageLocalService.dynamicQuery(
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

		return _pharmaCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _pharmaCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			fetchBygetPA_CS_PAI(long pharmaApplicationId) {

		return _pharmaCurrentStageLocalService.fetchBygetPA_CS_PAI(
			pharmaApplicationId);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			fetchPharmaCurrentStage(long pharmaCurrentStageId) {

		return _pharmaCurrentStageLocalService.fetchPharmaCurrentStage(
			pharmaCurrentStageId);
	}

	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
				findBygetpharmaById(long ApplicationId)
			throws com.nbp.pharmaceutical.application.form.service.exception.
				NoSuchPharmaCurrentStageException {

		return _pharmaCurrentStageLocalService.findBygetpharmaById(
			ApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _pharmaCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _pharmaCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _pharmaCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the pharma current stage with the primary key.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage
	 * @throws PortalException if a pharma current stage with the primary key could not be found
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
				getPharmaCurrentStage(long pharmaCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _pharmaCurrentStageLocalService.getPharmaCurrentStage(
			pharmaCurrentStageId);
	}

	/**
	 * Returns a range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @return the range of pharma current stages
	 */
	@Override
	public java.util.List
		<com.nbp.pharmaceutical.application.form.service.model.
			PharmaCurrentStage> getPharmaCurrentStages(int start, int end) {

		return _pharmaCurrentStageLocalService.getPharmaCurrentStages(
			start, end);
	}

	/**
	 * Returns the number of pharma current stages.
	 *
	 * @return the number of pharma current stages
	 */
	@Override
	public int getPharmaCurrentStagesCount() {
		return _pharmaCurrentStageLocalService.getPharmaCurrentStagesCount();
	}

	/**
	 * Updates the pharma current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 * @return the pharma current stage that was updated
	 */
	@Override
	public
		com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage
			updatePharmaCurrentStage(
				com.nbp.pharmaceutical.application.form.service.model.
					PharmaCurrentStage pharmaCurrentStage) {

		return _pharmaCurrentStageLocalService.updatePharmaCurrentStage(
			pharmaCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _pharmaCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public PharmaCurrentStageLocalService getWrappedService() {
		return _pharmaCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		PharmaCurrentStageLocalService pharmaCurrentStageLocalService) {

		_pharmaCurrentStageLocalService = pharmaCurrentStageLocalService;
	}

	private PharmaCurrentStageLocalService _pharmaCurrentStageLocalService;

}