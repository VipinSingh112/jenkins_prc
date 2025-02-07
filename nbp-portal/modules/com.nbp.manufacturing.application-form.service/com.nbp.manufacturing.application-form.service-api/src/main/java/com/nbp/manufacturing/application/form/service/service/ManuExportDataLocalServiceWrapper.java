/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuExportDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuExportDataLocalService
 * @generated
 */
public class ManuExportDataLocalServiceWrapper
	implements ManuExportDataLocalService,
			   ServiceWrapper<ManuExportDataLocalService> {

	public ManuExportDataLocalServiceWrapper() {
		this(null);
	}

	public ManuExportDataLocalServiceWrapper(
		ManuExportDataLocalService manuExportDataLocalService) {

		_manuExportDataLocalService = manuExportDataLocalService;
	}

	/**
	 * Adds the manu export data to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuExportDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuExportData the manu export data
	 * @return the manu export data that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		addManuExportData(
			com.nbp.manufacturing.application.form.service.model.ManuExportData
				manuExportData) {

		return _manuExportDataLocalService.addManuExportData(manuExportData);
	}

	/**
	 * Creates a new manu export data with the primary key. Does not add the manu export data to the database.
	 *
	 * @param manuExportDataId the primary key for the new manu export data
	 * @return the new manu export data
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		createManuExportData(long manuExportDataId) {

		return _manuExportDataLocalService.createManuExportData(
			manuExportDataId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuExportDataLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manu export data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuExportDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data that was removed
	 * @throws PortalException if a manu export data with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
			deleteManuExportData(long manuExportDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuExportDataLocalService.deleteManuExportData(
			manuExportDataId);
	}

	/**
	 * Deletes the manu export data from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuExportDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuExportData the manu export data
	 * @return the manu export data that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		deleteManuExportData(
			com.nbp.manufacturing.application.form.service.model.ManuExportData
				manuExportData) {

		return _manuExportDataLocalService.deleteManuExportData(manuExportData);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuExportDataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuExportDataLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuExportDataLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuExportDataLocalService.dynamicQuery();
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

		return _manuExportDataLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuExportDataModelImpl</code>.
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

		return _manuExportDataLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuExportDataModelImpl</code>.
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

		return _manuExportDataLocalService.dynamicQuery(
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

		return _manuExportDataLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manuExportDataLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		fetchManuExportData(long manuExportDataId) {

		return _manuExportDataLocalService.fetchManuExportData(
			manuExportDataId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuExportDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuExportDataLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuExportData>
			getMA_ED_MAI(long applicationId) {

		return _manuExportDataLocalService.getMA_ED_MAI(applicationId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		getManuByAppId(long applicationId) {

		return _manuExportDataLocalService.getManuByAppId(applicationId);
	}

	/**
	 * Returns the manu export data with the primary key.
	 *
	 * @param manuExportDataId the primary key of the manu export data
	 * @return the manu export data
	 * @throws PortalException if a manu export data with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
			getManuExportData(long manuExportDataId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuExportDataLocalService.getManuExportData(manuExportDataId);
	}

	/**
	 * Returns a range of all the manu export datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuExportDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu export datas
	 * @param end the upper bound of the range of manu export datas (not inclusive)
	 * @return the range of manu export datas
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuExportData>
			getManuExportDatas(int start, int end) {

		return _manuExportDataLocalService.getManuExportDatas(start, end);
	}

	/**
	 * Returns the number of manu export datas.
	 *
	 * @return the number of manu export datas
	 */
	@Override
	public int getManuExportDatasCount() {
		return _manuExportDataLocalService.getManuExportDatasCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuExportDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuExportDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu export data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuExportDataLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuExportData the manu export data
	 * @return the manu export data that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuExportData
		updateManuExportData(
			com.nbp.manufacturing.application.form.service.model.ManuExportData
				manuExportData) {

		return _manuExportDataLocalService.updateManuExportData(manuExportData);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuExportDataLocalService.getBasePersistence();
	}

	@Override
	public ManuExportDataLocalService getWrappedService() {
		return _manuExportDataLocalService;
	}

	@Override
	public void setWrappedService(
		ManuExportDataLocalService manuExportDataLocalService) {

		_manuExportDataLocalService = manuExportDataLocalService;
	}

	private ManuExportDataLocalService _manuExportDataLocalService;

}