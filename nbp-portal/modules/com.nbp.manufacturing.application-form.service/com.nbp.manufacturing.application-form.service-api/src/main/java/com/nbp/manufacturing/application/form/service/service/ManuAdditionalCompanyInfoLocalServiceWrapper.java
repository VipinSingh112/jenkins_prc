/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuAdditionalCompanyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalCompanyInfoLocalService
 * @generated
 */
public class ManuAdditionalCompanyInfoLocalServiceWrapper
	implements ManuAdditionalCompanyInfoLocalService,
			   ServiceWrapper<ManuAdditionalCompanyInfoLocalService> {

	public ManuAdditionalCompanyInfoLocalServiceWrapper() {
		this(null);
	}

	public ManuAdditionalCompanyInfoLocalServiceWrapper(
		ManuAdditionalCompanyInfoLocalService
			manuAdditionalCompanyInfoLocalService) {

		_manuAdditionalCompanyInfoLocalService =
			manuAdditionalCompanyInfoLocalService;
	}

	/**
	 * Adds the manu additional company info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 * @return the manu additional company info that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo addManuAdditionalCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return _manuAdditionalCompanyInfoLocalService.
			addManuAdditionalCompanyInfo(manuAdditionalCompanyInfo);
	}

	/**
	 * Creates a new manu additional company info with the primary key. Does not add the manu additional company info to the database.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key for the new manu additional company info
	 * @return the new manu additional company info
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo createManuAdditionalCompanyInfo(
			long manuAdditionalCompanyInfoId) {

		return _manuAdditionalCompanyInfoLocalService.
			createManuAdditionalCompanyInfo(manuAdditionalCompanyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalCompanyInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu additional company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info that was removed
	 * @throws PortalException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo deleteManuAdditionalCompanyInfo(
				long manuAdditionalCompanyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalCompanyInfoLocalService.
			deleteManuAdditionalCompanyInfo(manuAdditionalCompanyInfoId);
	}

	/**
	 * Deletes the manu additional company info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 * @return the manu additional company info that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo deleteManuAdditionalCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return _manuAdditionalCompanyInfoLocalService.
			deleteManuAdditionalCompanyInfo(manuAdditionalCompanyInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalCompanyInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuAdditionalCompanyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuAdditionalCompanyInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuAdditionalCompanyInfoLocalService.dynamicQuery();
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

		return _manuAdditionalCompanyInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalCompanyInfoModelImpl</code>.
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

		return _manuAdditionalCompanyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalCompanyInfoModelImpl</code>.
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

		return _manuAdditionalCompanyInfoLocalService.dynamicQuery(
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

		return _manuAdditionalCompanyInfoLocalService.dynamicQueryCount(
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

		return _manuAdditionalCompanyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo fetchManuAdditionalCompanyInfo(
			long manuAdditionalCompanyInfoId) {

		return _manuAdditionalCompanyInfoLocalService.
			fetchManuAdditionalCompanyInfo(manuAdditionalCompanyInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuAdditionalCompanyInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuAdditionalCompanyInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuAdditionalCompanyInfo> getMA_ACI_MAI(long applicationId) {

		return _manuAdditionalCompanyInfoLocalService.getMA_ACI_MAI(
			applicationId);
	}

	/**
	 * Returns the manu additional company info with the primary key.
	 *
	 * @param manuAdditionalCompanyInfoId the primary key of the manu additional company info
	 * @return the manu additional company info
	 * @throws PortalException if a manu additional company info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo getManuAdditionalCompanyInfo(
				long manuAdditionalCompanyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalCompanyInfoLocalService.
			getManuAdditionalCompanyInfo(manuAdditionalCompanyInfoId);
	}

	/**
	 * Returns a range of all the manu additional company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional company infos
	 * @param end the upper bound of the range of manu additional company infos (not inclusive)
	 * @return the range of manu additional company infos
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuAdditionalCompanyInfo> getManuAdditionalCompanyInfos(
				int start, int end) {

		return _manuAdditionalCompanyInfoLocalService.
			getManuAdditionalCompanyInfos(start, end);
	}

	/**
	 * Returns the number of manu additional company infos.
	 *
	 * @return the number of manu additional company infos
	 */
	@Override
	public int getManuAdditionalCompanyInfosCount() {
		return _manuAdditionalCompanyInfoLocalService.
			getManuAdditionalCompanyInfosCount();
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo getManuById(long applicationId) {

		return _manuAdditionalCompanyInfoLocalService.getManuById(
			applicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuAdditionalCompanyInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalCompanyInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu additional company info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalCompanyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalCompanyInfo the manu additional company info
	 * @return the manu additional company info that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalCompanyInfo updateManuAdditionalCompanyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalCompanyInfo manuAdditionalCompanyInfo) {

		return _manuAdditionalCompanyInfoLocalService.
			updateManuAdditionalCompanyInfo(manuAdditionalCompanyInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuAdditionalCompanyInfoLocalService.getBasePersistence();
	}

	@Override
	public ManuAdditionalCompanyInfoLocalService getWrappedService() {
		return _manuAdditionalCompanyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		ManuAdditionalCompanyInfoLocalService
			manuAdditionalCompanyInfoLocalService) {

		_manuAdditionalCompanyInfoLocalService =
			manuAdditionalCompanyInfoLocalService;
	}

	private ManuAdditionalCompanyInfoLocalService
		_manuAdditionalCompanyInfoLocalService;

}