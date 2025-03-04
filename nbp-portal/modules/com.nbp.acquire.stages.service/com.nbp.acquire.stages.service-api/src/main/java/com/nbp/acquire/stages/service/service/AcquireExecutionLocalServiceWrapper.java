/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AcquireExecutionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireExecutionLocalService
 * @generated
 */
public class AcquireExecutionLocalServiceWrapper
	implements AcquireExecutionLocalService,
			   ServiceWrapper<AcquireExecutionLocalService> {

	public AcquireExecutionLocalServiceWrapper() {
		this(null);
	}

	public AcquireExecutionLocalServiceWrapper(
		AcquireExecutionLocalService acquireExecutionLocalService) {

		_acquireExecutionLocalService = acquireExecutionLocalService;
	}

	/**
	 * Adds the acquire execution to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was added
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		addAcquireExecution(
			com.nbp.acquire.stages.service.model.AcquireExecution
				acquireExecution) {

		return _acquireExecutionLocalService.addAcquireExecution(
			acquireExecution);
	}

	/**
	 * Creates a new acquire execution with the primary key. Does not add the acquire execution to the database.
	 *
	 * @param acquireExecutionId the primary key for the new acquire execution
	 * @return the new acquire execution
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		createAcquireExecution(long acquireExecutionId) {

		return _acquireExecutionLocalService.createAcquireExecution(
			acquireExecutionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireExecutionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the acquire execution from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was removed
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		deleteAcquireExecution(
			com.nbp.acquire.stages.service.model.AcquireExecution
				acquireExecution) {

		return _acquireExecutionLocalService.deleteAcquireExecution(
			acquireExecution);
	}

	/**
	 * Deletes the acquire execution with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution that was removed
	 * @throws PortalException if a acquire execution with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
			deleteAcquireExecution(long acquireExecutionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireExecutionLocalService.deleteAcquireExecution(
			acquireExecutionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireExecutionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _acquireExecutionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _acquireExecutionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _acquireExecutionLocalService.dynamicQuery();
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

		return _acquireExecutionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
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

		return _acquireExecutionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
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

		return _acquireExecutionLocalService.dynamicQuery(
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

		return _acquireExecutionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _acquireExecutionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		fetchAcquireExecution(long acquireExecutionId) {

		return _acquireExecutionLocalService.fetchAcquireExecution(
			acquireExecutionId);
	}

	/**
	 * Returns the acquire execution with the primary key.
	 *
	 * @param acquireExecutionId the primary key of the acquire execution
	 * @return the acquire execution
	 * @throws PortalException if a acquire execution with the primary key could not be found
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
			getAcquireExecution(long acquireExecutionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireExecutionLocalService.getAcquireExecution(
			acquireExecutionId);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
			getAcquireExecutionBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireExecutionException {

		return _acquireExecutionLocalService.getAcquireExecutionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire executions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireExecutionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire executions
	 * @param end the upper bound of the range of acquire executions (not inclusive)
	 * @return the range of acquire executions
	 */
	@Override
	public java.util.List<com.nbp.acquire.stages.service.model.AcquireExecution>
		getAcquireExecutions(int start, int end) {

		return _acquireExecutionLocalService.getAcquireExecutions(start, end);
	}

	/**
	 * Returns the number of acquire executions.
	 *
	 * @return the number of acquire executions
	 */
	@Override
	public int getAcquireExecutionsCount() {
		return _acquireExecutionLocalService.getAcquireExecutionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _acquireExecutionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _acquireExecutionLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _acquireExecutionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _acquireExecutionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		updateAcquireApplicationExecutiion(
			String caseId, String paymentSection, String paymentDue) {

		return _acquireExecutionLocalService.updateAcquireApplicationExecutiion(
			caseId, paymentSection, paymentDue);
	}

	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		updateAcquireApplicationExecutiion(
			String caseId, String paymentSection, String paymentDue,
			String contractSEction, java.util.Date dateContractExecuted) {

		return _acquireExecutionLocalService.updateAcquireApplicationExecutiion(
			caseId, paymentSection, paymentDue, contractSEction,
			dateContractExecuted);
	}

	/**
	 * Updates the acquire execution in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireExecutionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireExecution the acquire execution
	 * @return the acquire execution that was updated
	 */
	@Override
	public com.nbp.acquire.stages.service.model.AcquireExecution
		updateAcquireExecution(
			com.nbp.acquire.stages.service.model.AcquireExecution
				acquireExecution) {

		return _acquireExecutionLocalService.updateAcquireExecution(
			acquireExecution);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _acquireExecutionLocalService.getBasePersistence();
	}

	@Override
	public AcquireExecutionLocalService getWrappedService() {
		return _acquireExecutionLocalService;
	}

	@Override
	public void setWrappedService(
		AcquireExecutionLocalService acquireExecutionLocalService) {

		_acquireExecutionLocalService = acquireExecutionLocalService;
	}

	private AcquireExecutionLocalService _acquireExecutionLocalService;

}