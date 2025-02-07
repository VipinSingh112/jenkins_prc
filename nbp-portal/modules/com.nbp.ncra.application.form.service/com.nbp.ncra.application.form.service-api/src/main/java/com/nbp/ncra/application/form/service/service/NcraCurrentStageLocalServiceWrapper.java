/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraCurrentStageLocalService
 * @generated
 */
public class NcraCurrentStageLocalServiceWrapper
	implements NcraCurrentStageLocalService,
			   ServiceWrapper<NcraCurrentStageLocalService> {

	public NcraCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public NcraCurrentStageLocalServiceWrapper(
		NcraCurrentStageLocalService ncraCurrentStageLocalService) {

		_ncraCurrentStageLocalService = ncraCurrentStageLocalService;
	}

	/**
	 * Adds the ncra current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was added
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
		addNcraCurrentStage(
			com.nbp.ncra.application.form.service.model.NcraCurrentStage
				ncraCurrentStage) {

		return _ncraCurrentStageLocalService.addNcraCurrentStage(
			ncraCurrentStage);
	}

	/**
	 * Creates a new ncra current stage with the primary key. Does not add the ncra current stage to the database.
	 *
	 * @param ncraCurrentStageId the primary key for the new ncra current stage
	 * @return the new ncra current stage
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
		createNcraCurrentStage(long ncraCurrentStageId) {

		return _ncraCurrentStageLocalService.createNcraCurrentStage(
			ncraCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage that was removed
	 * @throws PortalException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
			deleteNcraCurrentStage(long ncraCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraCurrentStageLocalService.deleteNcraCurrentStage(
			ncraCurrentStageId);
	}

	/**
	 * Deletes the ncra current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was removed
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
		deleteNcraCurrentStage(
			com.nbp.ncra.application.form.service.model.NcraCurrentStage
				ncraCurrentStage) {

		return _ncraCurrentStageLocalService.deleteNcraCurrentStage(
			ncraCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraCurrentStageLocalService.dynamicQuery();
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

		return _ncraCurrentStageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
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

		return _ncraCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
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

		return _ncraCurrentStageLocalService.dynamicQuery(
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

		return _ncraCurrentStageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncraCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
		fetchNcraCurrentStage(long ncraCurrentStageId) {

		return _ncraCurrentStageLocalService.fetchNcraCurrentStage(
			ncraCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraCurrentStageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraCurrentStage>
			getNCRA_CS_NAI(long ncraApplicationId) {

		return _ncraCurrentStageLocalService.getNCRA_CS_NAI(ncraApplicationId);
	}

	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
			getNcraCurrent_By_NCRA_Id(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraCurrentStageException {

		return _ncraCurrentStageLocalService.getNcraCurrent_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the ncra current stage with the primary key.
	 *
	 * @param ncraCurrentStageId the primary key of the ncra current stage
	 * @return the ncra current stage
	 * @throws PortalException if a ncra current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
			getNcraCurrentStage(long ncraCurrentStageId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraCurrentStageLocalService.getNcraCurrentStage(
			ncraCurrentStageId);
	}

	/**
	 * Returns a range of all the ncra current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra current stages
	 * @param end the upper bound of the range of ncra current stages (not inclusive)
	 * @return the range of ncra current stages
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.NcraCurrentStage>
			getNcraCurrentStages(int start, int end) {

		return _ncraCurrentStageLocalService.getNcraCurrentStages(start, end);
	}

	/**
	 * Returns the number of ncra current stages.
	 *
	 * @return the number of ncra current stages
	 */
	@Override
	public int getNcraCurrentStagesCount() {
		return _ncraCurrentStageLocalService.getNcraCurrentStagesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraCurrentStageLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraCurrentStageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncra current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraCurrentStage the ncra current stage
	 * @return the ncra current stage that was updated
	 */
	@Override
	public com.nbp.ncra.application.form.service.model.NcraCurrentStage
		updateNcraCurrentStage(
			com.nbp.ncra.application.form.service.model.NcraCurrentStage
				ncraCurrentStage) {

		return _ncraCurrentStageLocalService.updateNcraCurrentStage(
			ncraCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public NcraCurrentStageLocalService getWrappedService() {
		return _ncraCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		NcraCurrentStageLocalService ncraCurrentStageLocalService) {

		_ncraCurrentStageLocalService = ncraCurrentStageLocalService;
	}

	private NcraCurrentStageLocalService _ncraCurrentStageLocalService;

}