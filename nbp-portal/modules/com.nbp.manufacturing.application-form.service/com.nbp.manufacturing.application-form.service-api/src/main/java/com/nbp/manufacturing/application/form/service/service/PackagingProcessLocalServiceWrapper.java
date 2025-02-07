/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PackagingProcessLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcessLocalService
 * @generated
 */
public class PackagingProcessLocalServiceWrapper
	implements PackagingProcessLocalService,
			   ServiceWrapper<PackagingProcessLocalService> {

	public PackagingProcessLocalServiceWrapper() {
		this(null);
	}

	public PackagingProcessLocalServiceWrapper(
		PackagingProcessLocalService packagingProcessLocalService) {

		_packagingProcessLocalService = packagingProcessLocalService;
	}

	/**
	 * Adds the packaging process to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PackagingProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param packagingProcess the packaging process
	 * @return the packaging process that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		addPackagingProcess(
			com.nbp.manufacturing.application.form.service.model.
				PackagingProcess packagingProcess) {

		return _packagingProcessLocalService.addPackagingProcess(
			packagingProcess);
	}

	/**
	 * Creates a new packaging process with the primary key. Does not add the packaging process to the database.
	 *
	 * @param packagingProcessId the primary key for the new packaging process
	 * @return the new packaging process
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		createPackagingProcess(long packagingProcessId) {

		return _packagingProcessLocalService.createPackagingProcess(
			packagingProcessId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _packagingProcessLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the packaging process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PackagingProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process that was removed
	 * @throws PortalException if a packaging process with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
			deletePackagingProcess(long packagingProcessId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _packagingProcessLocalService.deletePackagingProcess(
			packagingProcessId);
	}

	/**
	 * Deletes the packaging process from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PackagingProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param packagingProcess the packaging process
	 * @return the packaging process that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		deletePackagingProcess(
			com.nbp.manufacturing.application.form.service.model.
				PackagingProcess packagingProcess) {

		return _packagingProcessLocalService.deletePackagingProcess(
			packagingProcess);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _packagingProcessLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _packagingProcessLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _packagingProcessLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _packagingProcessLocalService.dynamicQuery();
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

		return _packagingProcessLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.PackagingProcessModelImpl</code>.
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

		return _packagingProcessLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.PackagingProcessModelImpl</code>.
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

		return _packagingProcessLocalService.dynamicQuery(
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

		return _packagingProcessLocalService.dynamicQueryCount(dynamicQuery);
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

		return _packagingProcessLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		fetchPackagingProcess(long packagingProcessId) {

		return _packagingProcessLocalService.fetchPackagingProcess(
			packagingProcessId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _packagingProcessLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _packagingProcessLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.PackagingProcess>
			getMA_ED_MAI(long applicationId) {

		return _packagingProcessLocalService.getMA_ED_MAI(applicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.PackagingProcess>
			getMA_PP_MAI(long applicationId) {

		return _packagingProcessLocalService.getMA_PP_MAI(applicationId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		getManuByAppId(long applicationId) {

		return _packagingProcessLocalService.getManuByAppId(applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _packagingProcessLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the packaging process with the primary key.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process
	 * @throws PortalException if a packaging process with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
			getPackagingProcess(long packagingProcessId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _packagingProcessLocalService.getPackagingProcess(
			packagingProcessId);
	}

	/**
	 * Returns a range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of packaging processes
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.PackagingProcess>
			getPackagingProcesses(int start, int end) {

		return _packagingProcessLocalService.getPackagingProcesses(start, end);
	}

	/**
	 * Returns the number of packaging processes.
	 *
	 * @return the number of packaging processes
	 */
	@Override
	public int getPackagingProcessesCount() {
		return _packagingProcessLocalService.getPackagingProcessesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _packagingProcessLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the packaging process in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PackagingProcessLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param packagingProcess the packaging process
	 * @return the packaging process that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.PackagingProcess
		updatePackagingProcess(
			com.nbp.manufacturing.application.form.service.model.
				PackagingProcess packagingProcess) {

		return _packagingProcessLocalService.updatePackagingProcess(
			packagingProcess);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _packagingProcessLocalService.getBasePersistence();
	}

	@Override
	public PackagingProcessLocalService getWrappedService() {
		return _packagingProcessLocalService;
	}

	@Override
	public void setWrappedService(
		PackagingProcessLocalService packagingProcessLocalService) {

		_packagingProcessLocalService = packagingProcessLocalService;
	}

	private PackagingProcessLocalService _packagingProcessLocalService;

}