/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link JtbAddListDriverInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListDriverInfoLocalService
 * @generated
 */
public class JtbAddListDriverInfoLocalServiceWrapper
	implements JtbAddListDriverInfoLocalService,
			   ServiceWrapper<JtbAddListDriverInfoLocalService> {

	public JtbAddListDriverInfoLocalServiceWrapper() {
		this(null);
	}

	public JtbAddListDriverInfoLocalServiceWrapper(
		JtbAddListDriverInfoLocalService jtbAddListDriverInfoLocalService) {

		_jtbAddListDriverInfoLocalService = jtbAddListDriverInfoLocalService;
	}

	/**
	 * Adds the jtb add list driver info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListDriverInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 * @return the jtb add list driver info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
		addJtbAddListDriverInfo(
			com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
				jtbAddListDriverInfo) {

		return _jtbAddListDriverInfoLocalService.addJtbAddListDriverInfo(
			jtbAddListDriverInfo);
	}

	/**
	 * Creates a new jtb add list driver info with the primary key. Does not add the jtb add list driver info to the database.
	 *
	 * @param jtbAddListDriverInfoId the primary key for the new jtb add list driver info
	 * @return the new jtb add list driver info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
		createJtbAddListDriverInfo(long jtbAddListDriverInfoId) {

		return _jtbAddListDriverInfoLocalService.createJtbAddListDriverInfo(
			jtbAddListDriverInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListDriverInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb add list driver info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListDriverInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
		deleteJtbAddListDriverInfo(
			com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
				jtbAddListDriverInfo) {

		return _jtbAddListDriverInfoLocalService.deleteJtbAddListDriverInfo(
			jtbAddListDriverInfo);
	}

	/**
	 * Deletes the jtb add list driver info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListDriverInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info that was removed
	 * @throws PortalException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
			deleteJtbAddListDriverInfo(long jtbAddListDriverInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListDriverInfoLocalService.deleteJtbAddListDriverInfo(
			jtbAddListDriverInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListDriverInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbAddListDriverInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbAddListDriverInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbAddListDriverInfoLocalService.dynamicQuery();
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

		return _jtbAddListDriverInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoModelImpl</code>.
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

		return _jtbAddListDriverInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoModelImpl</code>.
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

		return _jtbAddListDriverInfoLocalService.dynamicQuery(
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

		return _jtbAddListDriverInfoLocalService.dynamicQueryCount(
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

		return _jtbAddListDriverInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
		fetchJtbAddListDriverInfo(long jtbAddListDriverInfoId) {

		return _jtbAddListDriverInfoLocalService.fetchJtbAddListDriverInfo(
			jtbAddListDriverInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbAddListDriverInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo>
			getByJtbAppId(long jtbApplicationId) {

		return _jtbAddListDriverInfoLocalService.getByJtbAppId(
			jtbApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbAddListDriverInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb add list driver info with the primary key.
	 *
	 * @param jtbAddListDriverInfoId the primary key of the jtb add list driver info
	 * @return the jtb add list driver info
	 * @throws PortalException if a jtb add list driver info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
			getJtbAddListDriverInfo(long jtbAddListDriverInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListDriverInfoLocalService.getJtbAddListDriverInfo(
			jtbAddListDriverInfoId);
	}

	/**
	 * Returns a range of all the jtb add list driver infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbAddListDriverInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb add list driver infos
	 * @param end the upper bound of the range of jtb add list driver infos (not inclusive)
	 * @return the range of jtb add list driver infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo>
			getJtbAddListDriverInfos(int start, int end) {

		return _jtbAddListDriverInfoLocalService.getJtbAddListDriverInfos(
			start, end);
	}

	/**
	 * Returns the number of jtb add list driver infos.
	 *
	 * @return the number of jtb add list driver infos
	 */
	@Override
	public int getJtbAddListDriverInfosCount() {
		return _jtbAddListDriverInfoLocalService.
			getJtbAddListDriverInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbAddListDriverInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbAddListDriverInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb add list driver info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbAddListDriverInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbAddListDriverInfo the jtb add list driver info
	 * @return the jtb add list driver info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
		updateJtbAddListDriverInfo(
			com.nbp.jtb.application.form.service.model.JtbAddListDriverInfo
				jtbAddListDriverInfo) {

		return _jtbAddListDriverInfoLocalService.updateJtbAddListDriverInfo(
			jtbAddListDriverInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _jtbAddListDriverInfoLocalService.getBasePersistence();
	}

	@Override
	public JtbAddListDriverInfoLocalService getWrappedService() {
		return _jtbAddListDriverInfoLocalService;
	}

	@Override
	public void setWrappedService(
		JtbAddListDriverInfoLocalService jtbAddListDriverInfoLocalService) {

		_jtbAddListDriverInfoLocalService = jtbAddListDriverInfoLocalService;
	}

	private JtbAddListDriverInfoLocalService _jtbAddListDriverInfoLocalService;

}