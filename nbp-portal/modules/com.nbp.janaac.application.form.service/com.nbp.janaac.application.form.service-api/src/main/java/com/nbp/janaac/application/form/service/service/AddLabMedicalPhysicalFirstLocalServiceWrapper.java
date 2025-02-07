/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabMedicalPhysicalFirstLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalPhysicalFirstLocalService
 * @generated
 */
public class AddLabMedicalPhysicalFirstLocalServiceWrapper
	implements AddLabMedicalPhysicalFirstLocalService,
			   ServiceWrapper<AddLabMedicalPhysicalFirstLocalService> {

	public AddLabMedicalPhysicalFirstLocalServiceWrapper() {
		this(null);
	}

	public AddLabMedicalPhysicalFirstLocalServiceWrapper(
		AddLabMedicalPhysicalFirstLocalService
			addLabMedicalPhysicalFirstLocalService) {

		_addLabMedicalPhysicalFirstLocalService =
			addLabMedicalPhysicalFirstLocalService;
	}

	/**
	 * Adds the add lab medical physical first to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was added
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
			addAddLabMedicalPhysicalFirst(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return _addLabMedicalPhysicalFirstLocalService.
			addAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirst);
	}

	/**
	 * Creates a new add lab medical physical first with the primary key. Does not add the add lab medical physical first to the database.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key for the new add lab medical physical first
	 * @return the new add lab medical physical first
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
			createAddLabMedicalPhysicalFirst(
				long addLabMedicalPhysicalFirstId) {

		return _addLabMedicalPhysicalFirstLocalService.
			createAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalFirstLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab medical physical first from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
			deleteAddLabMedicalPhysicalFirst(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return _addLabMedicalPhysicalFirstLocalService.
			deleteAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirst);
	}

	/**
	 * Deletes the add lab medical physical first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first that was removed
	 * @throws PortalException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
				deleteAddLabMedicalPhysicalFirst(
					long addLabMedicalPhysicalFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalFirstLocalService.
			deleteAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirstId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalFirstLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabMedicalPhysicalFirstLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabMedicalPhysicalFirstLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabMedicalPhysicalFirstLocalService.dynamicQuery();
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

		return _addLabMedicalPhysicalFirstLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
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

		return _addLabMedicalPhysicalFirstLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
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

		return _addLabMedicalPhysicalFirstLocalService.dynamicQuery(
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

		return _addLabMedicalPhysicalFirstLocalService.dynamicQueryCount(
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

		return _addLabMedicalPhysicalFirstLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
			fetchAddLabMedicalPhysicalFirst(long addLabMedicalPhysicalFirstId) {

		return _addLabMedicalPhysicalFirstLocalService.
			fetchAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirstId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabMedicalPhysicalFirstLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the add lab medical physical first with the primary key.
	 *
	 * @param addLabMedicalPhysicalFirstId the primary key of the add lab medical physical first
	 * @return the add lab medical physical first
	 * @throws PortalException if a add lab medical physical first with the primary key could not be found
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
				getAddLabMedicalPhysicalFirst(long addLabMedicalPhysicalFirstId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalFirstLocalService.
			getAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirstId);
	}

	/**
	 * Returns a range of all the add lab medical physical firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalPhysicalFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab medical physical firsts
	 * @param end the upper bound of the range of add lab medical physical firsts (not inclusive)
	 * @return the range of add lab medical physical firsts
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabMedicalPhysicalFirst> getAddLabMedicalPhysicalFirsts(
				int start, int end) {

		return _addLabMedicalPhysicalFirstLocalService.
			getAddLabMedicalPhysicalFirsts(start, end);
	}

	/**
	 * Returns the number of add lab medical physical firsts.
	 *
	 * @return the number of add lab medical physical firsts
	 */
	@Override
	public int getAddLabMedicalPhysicalFirstsCount() {
		return _addLabMedicalPhysicalFirstLocalService.
			getAddLabMedicalPhysicalFirstsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabMedicalPhysicalFirstLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.
			AddLabMedicalPhysicalFirst> getJanaacById(
				long janaacApplicationId) {

		return _addLabMedicalPhysicalFirstLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabMedicalPhysicalFirstLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabMedicalPhysicalFirstLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab medical physical first in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabMedicalPhysicalFirstLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabMedicalPhysicalFirst the add lab medical physical first
	 * @return the add lab medical physical first that was updated
	 */
	@Override
	public
		com.nbp.janaac.application.form.service.model.AddLabMedicalPhysicalFirst
			updateAddLabMedicalPhysicalFirst(
				com.nbp.janaac.application.form.service.model.
					AddLabMedicalPhysicalFirst addLabMedicalPhysicalFirst) {

		return _addLabMedicalPhysicalFirstLocalService.
			updateAddLabMedicalPhysicalFirst(addLabMedicalPhysicalFirst);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabMedicalPhysicalFirstLocalService.getBasePersistence();
	}

	@Override
	public AddLabMedicalPhysicalFirstLocalService getWrappedService() {
		return _addLabMedicalPhysicalFirstLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabMedicalPhysicalFirstLocalService
			addLabMedicalPhysicalFirstLocalService) {

		_addLabMedicalPhysicalFirstLocalService =
			addLabMedicalPhysicalFirstLocalService;
	}

	private AddLabMedicalPhysicalFirstLocalService
		_addLabMedicalPhysicalFirstLocalService;

}