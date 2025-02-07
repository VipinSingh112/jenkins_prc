/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcraVerifyWeighingDeviceInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDeviceInfoLocalService
 * @generated
 */
public class NcraVerifyWeighingDeviceInfoLocalServiceWrapper
	implements NcraVerifyWeighingDeviceInfoLocalService,
			   ServiceWrapper<NcraVerifyWeighingDeviceInfoLocalService> {

	public NcraVerifyWeighingDeviceInfoLocalServiceWrapper() {
		this(null);
	}

	public NcraVerifyWeighingDeviceInfoLocalServiceWrapper(
		NcraVerifyWeighingDeviceInfoLocalService
			ncraVerifyWeighingDeviceInfoLocalService) {

		_ncraVerifyWeighingDeviceInfoLocalService =
			ncraVerifyWeighingDeviceInfoLocalService;
	}

	/**
	 * Adds the ncra verify weighing device info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was added
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
			addNcraVerifyWeighingDeviceInfo(
				com.nbp.ncra.application.form.service.model.
					NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			addNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * Creates a new ncra verify weighing device info with the primary key. Does not add the ncra verify weighing device info to the database.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key for the new ncra verify weighing device info
	 * @return the new ncra verify weighing device info
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
			createNcraVerifyWeighingDeviceInfo(
				long ncraVerifyWeighingDeviceInfoId) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			createNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDeviceInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncra verify weighing device info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 * @throws PortalException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
				deleteNcraVerifyWeighingDeviceInfo(
					long ncraVerifyWeighingDeviceInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			deleteNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Deletes the ncra verify weighing device info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was removed
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
			deleteNcraVerifyWeighingDeviceInfo(
				com.nbp.ncra.application.form.service.model.
					NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			deleteNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDeviceInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncraVerifyWeighingDeviceInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncraVerifyWeighingDeviceInfoLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQuery();
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

		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
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

		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
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

		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQuery(
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

		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQueryCount(
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

		return _ncraVerifyWeighingDeviceInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
			fetchNcraVerifyWeighingDeviceInfo(
				long ncraVerifyWeighingDeviceInfoId) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			fetchNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.
			NcraVerifyWeighingDeviceInfo> getNcraVerify_By_DataList(
				long ncraApplicationId) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getNcraVerify_By_DataList(ncraApplicationId);
	}

	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
				getNcraVerify_By_NCRA_Id(long ncraApplicationId)
			throws com.nbp.ncra.application.form.service.exception.
				NoSuchNcraVerifyWeighingDeviceInfoException {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getNcraVerify_By_NCRA_Id(ncraApplicationId);
	}

	/**
	 * Returns the ncra verify weighing device info with the primary key.
	 *
	 * @param ncraVerifyWeighingDeviceInfoId the primary key of the ncra verify weighing device info
	 * @return the ncra verify weighing device info
	 * @throws PortalException if a ncra verify weighing device info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
				getNcraVerifyWeighingDeviceInfo(
					long ncraVerifyWeighingDeviceInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfoId);
	}

	/**
	 * Returns a range of all the ncra verify weighing device infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDeviceInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing device infos
	 * @param end the upper bound of the range of ncra verify weighing device infos (not inclusive)
	 * @return the range of ncra verify weighing device infos
	 */
	@Override
	public java.util.List
		<com.nbp.ncra.application.form.service.model.
			NcraVerifyWeighingDeviceInfo> getNcraVerifyWeighingDeviceInfos(
				int start, int end) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			getNcraVerifyWeighingDeviceInfos(start, end);
	}

	/**
	 * Returns the number of ncra verify weighing device infos.
	 *
	 * @return the number of ncra verify weighing device infos
	 */
	@Override
	public int getNcraVerifyWeighingDeviceInfosCount() {
		return _ncraVerifyWeighingDeviceInfoLocalService.
			getNcraVerifyWeighingDeviceInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncraVerifyWeighingDeviceInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncraVerifyWeighingDeviceInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncra verify weighing device info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraVerifyWeighingDeviceInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraVerifyWeighingDeviceInfo the ncra verify weighing device info
	 * @return the ncra verify weighing device info that was updated
	 */
	@Override
	public
		com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDeviceInfo
			updateNcraVerifyWeighingDeviceInfo(
				com.nbp.ncra.application.form.service.model.
					NcraVerifyWeighingDeviceInfo ncraVerifyWeighingDeviceInfo) {

		return _ncraVerifyWeighingDeviceInfoLocalService.
			updateNcraVerifyWeighingDeviceInfo(ncraVerifyWeighingDeviceInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncraVerifyWeighingDeviceInfoLocalService.getBasePersistence();
	}

	@Override
	public NcraVerifyWeighingDeviceInfoLocalService getWrappedService() {
		return _ncraVerifyWeighingDeviceInfoLocalService;
	}

	@Override
	public void setWrappedService(
		NcraVerifyWeighingDeviceInfoLocalService
			ncraVerifyWeighingDeviceInfoLocalService) {

		_ncraVerifyWeighingDeviceInfoLocalService =
			ncraVerifyWeighingDeviceInfoLocalService;
	}

	private NcraVerifyWeighingDeviceInfoLocalService
		_ncraVerifyWeighingDeviceInfoLocalService;

}