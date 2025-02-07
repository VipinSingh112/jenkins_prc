/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabAppliInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabAppliInfoLocalService
 * @generated
 */
public class AddLabAppliInfoLocalServiceWrapper
	implements AddLabAppliInfoLocalService,
			   ServiceWrapper<AddLabAppliInfoLocalService> {

	public AddLabAppliInfoLocalServiceWrapper() {
		this(null);
	}

	public AddLabAppliInfoLocalServiceWrapper(
		AddLabAppliInfoLocalService addLabAppliInfoLocalService) {

		_addLabAppliInfoLocalService = addLabAppliInfoLocalService;
	}

	/**
	 * Adds the add lab appli info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
		addAddLabAppliInfo(
			com.nbp.janaac.application.form.service.model.AddLabAppliInfo
				addLabAppliInfo) {

		return _addLabAppliInfoLocalService.addAddLabAppliInfo(addLabAppliInfo);
	}

	/**
	 * Creates a new add lab appli info with the primary key. Does not add the add lab appli info to the database.
	 *
	 * @param addLabAppliInfoId the primary key for the new add lab appli info
	 * @return the new add lab appli info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
		createAddLabAppliInfo(long addLabAppliInfoId) {

		return _addLabAppliInfoLocalService.createAddLabAppliInfo(
			addLabAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabAppliInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the add lab appli info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
		deleteAddLabAppliInfo(
			com.nbp.janaac.application.form.service.model.AddLabAppliInfo
				addLabAppliInfo) {

		return _addLabAppliInfoLocalService.deleteAddLabAppliInfo(
			addLabAppliInfo);
	}

	/**
	 * Deletes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws PortalException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
			deleteAddLabAppliInfo(long addLabAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabAppliInfoLocalService.deleteAddLabAppliInfo(
			addLabAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabAppliInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabAppliInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabAppliInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabAppliInfoLocalService.dynamicQuery();
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

		return _addLabAppliInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
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

		return _addLabAppliInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
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

		return _addLabAppliInfoLocalService.dynamicQuery(
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

		return _addLabAppliInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addLabAppliInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
		fetchAddLabAppliInfo(long addLabAppliInfoId) {

		return _addLabAppliInfoLocalService.fetchAddLabAppliInfo(
			addLabAppliInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabAppliInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab appli info with the primary key.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws PortalException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
			getAddLabAppliInfo(long addLabAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabAppliInfoLocalService.getAddLabAppliInfo(
			addLabAppliInfoId);
	}

	/**
	 * Returns a range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of add lab appli infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabAppliInfo>
			getAddLabAppliInfos(int start, int end) {

		return _addLabAppliInfoLocalService.getAddLabAppliInfos(start, end);
	}

	/**
	 * Returns the number of add lab appli infos.
	 *
	 * @return the number of add lab appli infos
	 */
	@Override
	public int getAddLabAppliInfosCount() {
		return _addLabAppliInfoLocalService.getAddLabAppliInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabAppliInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabAppliInfo>
			getJanaacById(long janaacApplicationId) {

		return _addLabAppliInfoLocalService.getJanaacById(janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabAppliInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabAppliInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add lab appli info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabAppliInfo the add lab appli info
	 * @return the add lab appli info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabAppliInfo
		updateAddLabAppliInfo(
			com.nbp.janaac.application.form.service.model.AddLabAppliInfo
				addLabAppliInfo) {

		return _addLabAppliInfoLocalService.updateAddLabAppliInfo(
			addLabAppliInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabAppliInfoLocalService.getBasePersistence();
	}

	@Override
	public AddLabAppliInfoLocalService getWrappedService() {
		return _addLabAppliInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabAppliInfoLocalService addLabAppliInfoLocalService) {

		_addLabAppliInfoLocalService = addLabAppliInfoLocalService;
	}

	private AddLabAppliInfoLocalService _addLabAppliInfoLocalService;

}