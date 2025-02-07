/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AttractDetailFormInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AttractDetailFormInfoLocalService
 * @generated
 */
public class AttractDetailFormInfoLocalServiceWrapper
	implements AttractDetailFormInfoLocalService,
			   ServiceWrapper<AttractDetailFormInfoLocalService> {

	public AttractDetailFormInfoLocalServiceWrapper() {
		this(null);
	}

	public AttractDetailFormInfoLocalServiceWrapper(
		AttractDetailFormInfoLocalService attractDetailFormInfoLocalService) {

		_attractDetailFormInfoLocalService = attractDetailFormInfoLocalService;
	}

	/**
	 * Adds the attract detail form info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractDetailFormInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 * @return the attract detail form info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
		addAttractDetailFormInfo(
			com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
				attractDetailFormInfo) {

		return _attractDetailFormInfoLocalService.addAttractDetailFormInfo(
			attractDetailFormInfo);
	}

	/**
	 * Creates a new attract detail form info with the primary key. Does not add the attract detail form info to the database.
	 *
	 * @param attractDetailFormInfoId the primary key for the new attract detail form info
	 * @return the new attract detail form info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
		createAttractDetailFormInfo(long attractDetailFormInfoId) {

		return _attractDetailFormInfoLocalService.createAttractDetailFormInfo(
			attractDetailFormInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractDetailFormInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the attract detail form info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractDetailFormInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 * @return the attract detail form info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
		deleteAttractDetailFormInfo(
			com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
				attractDetailFormInfo) {

		return _attractDetailFormInfoLocalService.deleteAttractDetailFormInfo(
			attractDetailFormInfo);
	}

	/**
	 * Deletes the attract detail form info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractDetailFormInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info that was removed
	 * @throws PortalException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
			deleteAttractDetailFormInfo(long attractDetailFormInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractDetailFormInfoLocalService.deleteAttractDetailFormInfo(
			attractDetailFormInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractDetailFormInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _attractDetailFormInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _attractDetailFormInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _attractDetailFormInfoLocalService.dynamicQuery();
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

		return _attractDetailFormInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractDetailFormInfoModelImpl</code>.
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

		return _attractDetailFormInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractDetailFormInfoModelImpl</code>.
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

		return _attractDetailFormInfoLocalService.dynamicQuery(
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

		return _attractDetailFormInfoLocalService.dynamicQueryCount(
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

		return _attractDetailFormInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
		fetchAttractDetailFormInfo(long attractDetailFormInfoId) {

		return _attractDetailFormInfoLocalService.fetchAttractDetailFormInfo(
			attractDetailFormInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _attractDetailFormInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the attract detail form info with the primary key.
	 *
	 * @param attractDetailFormInfoId the primary key of the attract detail form info
	 * @return the attract detail form info
	 * @throws PortalException if a attract detail form info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
			getAttractDetailFormInfo(long attractDetailFormInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractDetailFormInfoLocalService.getAttractDetailFormInfo(
			attractDetailFormInfoId);
	}

	/**
	 * Returns a range of all the attract detail form infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.AttractDetailFormInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attract detail form infos
	 * @param end the upper bound of the range of attract detail form infos (not inclusive)
	 * @return the range of attract detail form infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.AttractDetailFormInfo>
			getAttractDetailFormInfos(int start, int end) {

		return _attractDetailFormInfoLocalService.getAttractDetailFormInfos(
			start, end);
	}

	/**
	 * Returns the number of attract detail form infos.
	 *
	 * @return the number of attract detail form infos
	 */
	@Override
	public int getAttractDetailFormInfosCount() {
		return _attractDetailFormInfoLocalService.
			getAttractDetailFormInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _attractDetailFormInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
			getJTB_ByApplicationId(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractDetailFormInfoException {

		return _attractDetailFormInfoLocalService.getJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _attractDetailFormInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _attractDetailFormInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the attract detail form info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AttractDetailFormInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param attractDetailFormInfo the attract detail form info
	 * @return the attract detail form info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
		updateAttractDetailFormInfo(
			com.nbp.jtb.application.form.service.model.AttractDetailFormInfo
				attractDetailFormInfo) {

		return _attractDetailFormInfoLocalService.updateAttractDetailFormInfo(
			attractDetailFormInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _attractDetailFormInfoLocalService.getBasePersistence();
	}

	@Override
	public AttractDetailFormInfoLocalService getWrappedService() {
		return _attractDetailFormInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AttractDetailFormInfoLocalService attractDetailFormInfoLocalService) {

		_attractDetailFormInfoLocalService = attractDetailFormInfoLocalService;
	}

	private AttractDetailFormInfoLocalService
		_attractDetailFormInfoLocalService;

}