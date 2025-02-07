/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAddBranchDetailInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddBranchDetailInfoLocalService
 * @generated
 */
public class JtbAddBranchDetailInfoLocalServiceWrapper
	implements JtbAddBranchDetailInfoLocalService,
			   ServiceWrapper<JtbAddBranchDetailInfoLocalService> {

	public JtbAddBranchDetailInfoLocalServiceWrapper() {
		this(null);
	}

	public JtbAddBranchDetailInfoLocalServiceWrapper(
		JtbAddBranchDetailInfoLocalService jtbAddBranchDetailInfoLocalService) {

		_jtbAddBranchDetailInfoLocalService =
			jtbAddBranchDetailInfoLocalService;
	}

	/**
	 * Adds the jtb add branch detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 * @return the jtb add branch detail info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		addJtbAddBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
				jtbAddBranchDetailInfo) {

		return _jtbAddBranchDetailInfoLocalService.addJtbAddBranchDetailInfo(
			jtbAddBranchDetailInfo);
	}

	/**
	 * Creates a new jtb add branch detail info with the primary key. Does not add the jtb add branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb add branch detail info
	 * @return the new jtb add branch detail info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		createJtbAddBranchDetailInfo(long jtbBranchDetailInfoId) {

		return _jtbAddBranchDetailInfoLocalService.createJtbAddBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddBranchDetailInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb add branch detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		deleteJtbAddBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
				jtbAddBranchDetailInfo) {

		return _jtbAddBranchDetailInfoLocalService.deleteJtbAddBranchDetailInfo(
			jtbAddBranchDetailInfo);
	}

	/**
	 * Deletes the jtb add branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info that was removed
	 * @throws PortalException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
			deleteJtbAddBranchDetailInfo(long jtbBranchDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddBranchDetailInfoLocalService.deleteJtbAddBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddBranchDetailInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAddBranchDetailInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAddBranchDetailInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAddBranchDetailInfoLocalService.dynamicQuery();
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

		return _jtbAddBranchDetailInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddBranchDetailInfoModelImpl</code>.
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

		return _jtbAddBranchDetailInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddBranchDetailInfoModelImpl</code>.
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

		return _jtbAddBranchDetailInfoLocalService.dynamicQuery(
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

		return _jtbAddBranchDetailInfoLocalService.dynamicQueryCount(
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

		return _jtbAddBranchDetailInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		fetchJtbAddBranchDetailInfo(long jtbBranchDetailInfoId) {

		return _jtbAddBranchDetailInfoLocalService.fetchJtbAddBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAddBranchDetailInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo>
			getByJtbAppId(long jtbApplicationId) {

		return _jtbAddBranchDetailInfoLocalService.getByJtbAppId(
			jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAddBranchDetailInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		getJTB_ByApplicationId(long jtbApplicationId) {

		return _jtbAddBranchDetailInfoLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the jtb add branch detail info with the primary key.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb add branch detail info
	 * @return the jtb add branch detail info
	 * @throws PortalException if a jtb add branch detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
			getJtbAddBranchDetailInfo(long jtbBranchDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddBranchDetailInfoLocalService.getJtbAddBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * Returns a range of all the jtb add branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add branch detail infos
	 * @param end the upper bound of the range of jtb add branch detail infos (not inclusive)
	 * @return the range of jtb add branch detail infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo>
			getJtbAddBranchDetailInfos(int start, int end) {

		return _jtbAddBranchDetailInfoLocalService.getJtbAddBranchDetailInfos(
			start, end);
	}

	/**
	 * Returns the number of jtb add branch detail infos.
	 *
	 * @return the number of jtb add branch detail infos
	 */
	@Override
	public int getJtbAddBranchDetailInfosCount() {
		return _jtbAddBranchDetailInfoLocalService.
			getJtbAddBranchDetailInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddBranchDetailInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddBranchDetailInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb add branch detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddBranchDetailInfo the jtb add branch detail info
	 * @return the jtb add branch detail info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
		updateJtbAddBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbAddBranchDetailInfo
				jtbAddBranchDetailInfo) {

		return _jtbAddBranchDetailInfoLocalService.updateJtbAddBranchDetailInfo(
			jtbAddBranchDetailInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAddBranchDetailInfoLocalService.getBasePersistence();
	}

	@Override
	public JtbAddBranchDetailInfoLocalService getWrappedService() {
		return _jtbAddBranchDetailInfoLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAddBranchDetailInfoLocalService jtbAddBranchDetailInfoLocalService) {

		_jtbAddBranchDetailInfoLocalService =
			jtbAddBranchDetailInfoLocalService;
	}

	private JtbAddBranchDetailInfoLocalService
		_jtbAddBranchDetailInfoLocalService;

}