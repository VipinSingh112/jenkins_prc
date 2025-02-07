/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiInsolvencyCurrentStageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyCurrentStageLocalService
 * @generated
 */
public class OsiInsolvencyCurrentStageLocalServiceWrapper
	implements OsiInsolvencyCurrentStageLocalService,
			   ServiceWrapper<OsiInsolvencyCurrentStageLocalService> {

	public OsiInsolvencyCurrentStageLocalServiceWrapper() {
		this(null);
	}

	public OsiInsolvencyCurrentStageLocalServiceWrapper(
		OsiInsolvencyCurrentStageLocalService
			osiInsolvencyCurrentStageLocalService) {

		_osiInsolvencyCurrentStageLocalService =
			osiInsolvencyCurrentStageLocalService;
	}

	/**
	 * Adds the osi insolvency current stage to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage addOsiInsolvencyCurrentStage(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return _osiInsolvencyCurrentStageLocalService.
			addOsiInsolvencyCurrentStage(osiInsolvencyCurrentStage);
	}

	/**
	 * Creates a new osi insolvency current stage with the primary key. Does not add the osi insolvency current stage to the database.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key for the new osi insolvency current stage
	 * @return the new osi insolvency current stage
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage createOsiInsolvencyCurrentStage(
			long osiInsolvencyCurrentStageId) {

		return _osiInsolvencyCurrentStageLocalService.
			createOsiInsolvencyCurrentStage(osiInsolvencyCurrentStageId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyCurrentStageLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi insolvency current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 * @throws PortalException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage deleteOsiInsolvencyCurrentStage(
				long osiInsolvencyCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyCurrentStageLocalService.
			deleteOsiInsolvencyCurrentStage(osiInsolvencyCurrentStageId);
	}

	/**
	 * Deletes the osi insolvency current stage from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage deleteOsiInsolvencyCurrentStage(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return _osiInsolvencyCurrentStageLocalService.
			deleteOsiInsolvencyCurrentStage(osiInsolvencyCurrentStage);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyCurrentStageLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiInsolvencyCurrentStageLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiInsolvencyCurrentStageLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiInsolvencyCurrentStageLocalService.dynamicQuery();
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

		return _osiInsolvencyCurrentStageLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
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

		return _osiInsolvencyCurrentStageLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
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

		return _osiInsolvencyCurrentStageLocalService.dynamicQuery(
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

		return _osiInsolvencyCurrentStageLocalService.dynamicQueryCount(
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

		return _osiInsolvencyCurrentStageLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage fetchOsiInsolvencyCurrentStage(
			long osiInsolvencyCurrentStageId) {

		return _osiInsolvencyCurrentStageLocalService.
			fetchOsiInsolvencyCurrentStage(osiInsolvencyCurrentStageId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiInsolvencyCurrentStageLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiInsolvencyCurrentStageLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage getOI_Stage_OII(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiInsolvencyCurrentStageException {

		return _osiInsolvencyCurrentStageLocalService.getOI_Stage_OII(
			osiInsolvencyId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiInsolvencyCurrentStageLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi insolvency current stage with the primary key.
	 *
	 * @param osiInsolvencyCurrentStageId the primary key of the osi insolvency current stage
	 * @return the osi insolvency current stage
	 * @throws PortalException if a osi insolvency current stage with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage getOsiInsolvencyCurrentStage(
				long osiInsolvencyCurrentStageId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyCurrentStageLocalService.
			getOsiInsolvencyCurrentStage(osiInsolvencyCurrentStageId);
	}

	/**
	 * Returns a range of all the osi insolvency current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiInsolvencyCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency current stages
	 * @param end the upper bound of the range of osi insolvency current stages (not inclusive)
	 * @return the range of osi insolvency current stages
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiInsolvencyCurrentStage> getOsiInsolvencyCurrentStages(
				int start, int end) {

		return _osiInsolvencyCurrentStageLocalService.
			getOsiInsolvencyCurrentStages(start, end);
	}

	/**
	 * Returns the number of osi insolvency current stages.
	 *
	 * @return the number of osi insolvency current stages
	 */
	@Override
	public int getOsiInsolvencyCurrentStagesCount() {
		return _osiInsolvencyCurrentStageLocalService.
			getOsiInsolvencyCurrentStagesCount();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage getOsiInsolvenyById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiInsolvencyCurrentStageException {

		return _osiInsolvencyCurrentStageLocalService.getOsiInsolvenyById(
			osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiInsolvencyCurrentStageLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi insolvency current stage in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyCurrentStageLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyCurrentStage the osi insolvency current stage
	 * @return the osi insolvency current stage that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiInsolvencyCurrentStage updateOsiInsolvencyCurrentStage(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiInsolvencyCurrentStage osiInsolvencyCurrentStage) {

		return _osiInsolvencyCurrentStageLocalService.
			updateOsiInsolvencyCurrentStage(osiInsolvencyCurrentStage);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiInsolvencyCurrentStageLocalService.getBasePersistence();
	}

	@Override
	public OsiInsolvencyCurrentStageLocalService getWrappedService() {
		return _osiInsolvencyCurrentStageLocalService;
	}

	@Override
	public void setWrappedService(
		OsiInsolvencyCurrentStageLocalService
			osiInsolvencyCurrentStageLocalService) {

		_osiInsolvencyCurrentStageLocalService =
			osiInsolvencyCurrentStageLocalService;
	}

	private OsiInsolvencyCurrentStageLocalService
		_osiInsolvencyCurrentStageLocalService;

}