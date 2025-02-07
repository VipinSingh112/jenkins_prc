/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAddCraftEmployeeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddCraftEmployeeInfoLocalService
 * @generated
 */
public class JtbAddCraftEmployeeInfoLocalServiceWrapper
	implements JtbAddCraftEmployeeInfoLocalService,
			   ServiceWrapper<JtbAddCraftEmployeeInfoLocalService> {

	public JtbAddCraftEmployeeInfoLocalServiceWrapper() {
		this(null);
	}

	public JtbAddCraftEmployeeInfoLocalServiceWrapper(
		JtbAddCraftEmployeeInfoLocalService
			jtbAddCraftEmployeeInfoLocalService) {

		_jtbAddCraftEmployeeInfoLocalService =
			jtbAddCraftEmployeeInfoLocalService;
	}

	/**
	 * Adds the jtb add craft employee info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
		addJtbAddCraftEmployeeInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
				jtbAddCraftEmployeeInfo) {

		return _jtbAddCraftEmployeeInfoLocalService.addJtbAddCraftEmployeeInfo(
			jtbAddCraftEmployeeInfo);
	}

	/**
	 * Creates a new jtb add craft employee info with the primary key. Does not add the jtb add craft employee info to the database.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key for the new jtb add craft employee info
	 * @return the new jtb add craft employee info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
		createJtbAddCraftEmployeeInfo(long jtbAddCraftEmployeeInfoId) {

		return _jtbAddCraftEmployeeInfoLocalService.
			createJtbAddCraftEmployeeInfo(jtbAddCraftEmployeeInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftEmployeeInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb add craft employee info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
		deleteJtbAddCraftEmployeeInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
				jtbAddCraftEmployeeInfo) {

		return _jtbAddCraftEmployeeInfoLocalService.
			deleteJtbAddCraftEmployeeInfo(jtbAddCraftEmployeeInfo);
	}

	/**
	 * Deletes the jtb add craft employee info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info that was removed
	 * @throws PortalException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
			deleteJtbAddCraftEmployeeInfo(long jtbAddCraftEmployeeInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftEmployeeInfoLocalService.
			deleteJtbAddCraftEmployeeInfo(jtbAddCraftEmployeeInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftEmployeeInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAddCraftEmployeeInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAddCraftEmployeeInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAddCraftEmployeeInfoLocalService.dynamicQuery();
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

		return _jtbAddCraftEmployeeInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
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

		return _jtbAddCraftEmployeeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
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

		return _jtbAddCraftEmployeeInfoLocalService.dynamicQuery(
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

		return _jtbAddCraftEmployeeInfoLocalService.dynamicQueryCount(
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

		return _jtbAddCraftEmployeeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
		fetchJtbAddCraftEmployeeInfo(long jtbAddCraftEmployeeInfoId) {

		return _jtbAddCraftEmployeeInfoLocalService.
			fetchJtbAddCraftEmployeeInfo(jtbAddCraftEmployeeInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAddCraftEmployeeInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo>
			getByJtbAppId(long jtbApplicationId) {

		return _jtbAddCraftEmployeeInfoLocalService.getByJtbAppId(
			jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAddCraftEmployeeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb add craft employee info with the primary key.
	 *
	 * @param jtbAddCraftEmployeeInfoId the primary key of the jtb add craft employee info
	 * @return the jtb add craft employee info
	 * @throws PortalException if a jtb add craft employee info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
			getJtbAddCraftEmployeeInfo(long jtbAddCraftEmployeeInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftEmployeeInfoLocalService.getJtbAddCraftEmployeeInfo(
			jtbAddCraftEmployeeInfoId);
	}

	/**
	 * Returns a range of all the jtb add craft employee infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddCraftEmployeeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add craft employee infos
	 * @param end the upper bound of the range of jtb add craft employee infos (not inclusive)
	 * @return the range of jtb add craft employee infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo>
			getJtbAddCraftEmployeeInfos(int start, int end) {

		return _jtbAddCraftEmployeeInfoLocalService.getJtbAddCraftEmployeeInfos(
			start, end);
	}

	/**
	 * Returns the number of jtb add craft employee infos.
	 *
	 * @return the number of jtb add craft employee infos
	 */
	@Override
	public int getJtbAddCraftEmployeeInfosCount() {
		return _jtbAddCraftEmployeeInfoLocalService.
			getJtbAddCraftEmployeeInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddCraftEmployeeInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddCraftEmployeeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb add craft employee info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddCraftEmployeeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddCraftEmployeeInfo the jtb add craft employee info
	 * @return the jtb add craft employee info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
		updateJtbAddCraftEmployeeInfo(
			com.nbp.jtb.application.form.service.model.JtbAddCraftEmployeeInfo
				jtbAddCraftEmployeeInfo) {

		return _jtbAddCraftEmployeeInfoLocalService.
			updateJtbAddCraftEmployeeInfo(jtbAddCraftEmployeeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAddCraftEmployeeInfoLocalService.getBasePersistence();
	}

	@Override
	public JtbAddCraftEmployeeInfoLocalService getWrappedService() {
		return _jtbAddCraftEmployeeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAddCraftEmployeeInfoLocalService
			jtbAddCraftEmployeeInfoLocalService) {

		_jtbAddCraftEmployeeInfoLocalService =
			jtbAddCraftEmployeeInfoLocalService;
	}

	private JtbAddCraftEmployeeInfoLocalService
		_jtbAddCraftEmployeeInfoLocalService;

}