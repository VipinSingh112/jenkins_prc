/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeDirectorListinAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBoxLocalService
 * @generated
 */
public class CreativeDirectorListinAddBoxLocalServiceWrapper
	implements CreativeDirectorListinAddBoxLocalService,
			   ServiceWrapper<CreativeDirectorListinAddBoxLocalService> {

	public CreativeDirectorListinAddBoxLocalServiceWrapper() {
		this(null);
	}

	public CreativeDirectorListinAddBoxLocalServiceWrapper(
		CreativeDirectorListinAddBoxLocalService
			creativeDirectorListinAddBoxLocalService) {

		_creativeDirectorListinAddBoxLocalService =
			creativeDirectorListinAddBoxLocalService;
	}

	/**
	 * Adds the creative director listin add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDirectorListinAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 * @return the creative director listin add box that was added
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox addCreativeDirectorListinAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return _creativeDirectorListinAddBoxLocalService.
			addCreativeDirectorListinAddBox(creativeDirectorListinAddBox);
	}

	/**
	 * Creates a new creative director listin add box with the primary key. Does not add the creative director listin add box to the database.
	 *
	 * @param creativeDirectorBoxId the primary key for the new creative director listin add box
	 * @return the new creative director listin add box
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox createCreativeDirectorListinAddBox(
				long creativeDirectorBoxId) {

		return _creativeDirectorListinAddBoxLocalService.
			createCreativeDirectorListinAddBox(creativeDirectorBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDirectorListinAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void delete_CA_CDB_CAI(long creativeApplicationId) {
		_creativeDirectorListinAddBoxLocalService.delete_CA_CDB_CAI(
			creativeApplicationId);
	}

	/**
	 * Deletes the creative director listin add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDirectorListinAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 * @return the creative director listin add box that was removed
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox deleteCreativeDirectorListinAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return _creativeDirectorListinAddBoxLocalService.
			deleteCreativeDirectorListinAddBox(creativeDirectorListinAddBox);
	}

	/**
	 * Deletes the creative director listin add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDirectorListinAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box that was removed
	 * @throws PortalException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox deleteCreativeDirectorListinAddBox(
					long creativeDirectorBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDirectorListinAddBoxLocalService.
			deleteCreativeDirectorListinAddBox(creativeDirectorBoxId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDirectorListinAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeDirectorListinAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeDirectorListinAddBoxLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeDirectorListinAddBoxLocalService.dynamicQuery();
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

		return _creativeDirectorListinAddBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxModelImpl</code>.
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

		return _creativeDirectorListinAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxModelImpl</code>.
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

		return _creativeDirectorListinAddBoxLocalService.dynamicQuery(
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

		return _creativeDirectorListinAddBoxLocalService.dynamicQueryCount(
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

		return _creativeDirectorListinAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox fetchCreativeDirectorListinAddBox(
				long creativeDirectorBoxId) {

		return _creativeDirectorListinAddBoxLocalService.
			fetchCreativeDirectorListinAddBox(creativeDirectorBoxId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeDirectorListinAddBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox> getCA_CDB_CAI(
				long creativeApplicationId) {

		return _creativeDirectorListinAddBoxLocalService.getCA_CDB_CAI(
			creativeApplicationId);
	}

	/**
	 * Returns the creative director listin add box with the primary key.
	 *
	 * @param creativeDirectorBoxId the primary key of the creative director listin add box
	 * @return the creative director listin add box
	 * @throws PortalException if a creative director listin add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox getCreativeDirectorListinAddBox(
					long creativeDirectorBoxId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDirectorListinAddBoxLocalService.
			getCreativeDirectorListinAddBox(creativeDirectorBoxId);
	}

	/**
	 * Returns a range of all the creative director listin add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative director listin add boxes
	 * @param end the upper bound of the range of creative director listin add boxes (not inclusive)
	 * @return the range of creative director listin add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox> getCreativeDirectorListinAddBoxes(
				int start, int end) {

		return _creativeDirectorListinAddBoxLocalService.
			getCreativeDirectorListinAddBoxes(start, end);
	}

	/**
	 * Returns the number of creative director listin add boxes.
	 *
	 * @return the number of creative director listin add boxes
	 */
	@Override
	public int getCreativeDirectorListinAddBoxesCount() {
		return _creativeDirectorListinAddBoxLocalService.
			getCreativeDirectorListinAddBoxesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeDirectorListinAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeDirectorListinAddBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeDirectorListinAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the creative director listin add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeDirectorListinAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeDirectorListinAddBox the creative director listin add box
	 * @return the creative director listin add box that was updated
	 */
	@Override
	public
		com.nbp.creative.application.form.service.model.
			CreativeDirectorListinAddBox updateCreativeDirectorListinAddBox(
				com.nbp.creative.application.form.service.model.
					CreativeDirectorListinAddBox creativeDirectorListinAddBox) {

		return _creativeDirectorListinAddBoxLocalService.
			updateCreativeDirectorListinAddBox(creativeDirectorListinAddBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeDirectorListinAddBoxLocalService.getBasePersistence();
	}

	@Override
	public CreativeDirectorListinAddBoxLocalService getWrappedService() {
		return _creativeDirectorListinAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeDirectorListinAddBoxLocalService
			creativeDirectorListinAddBoxLocalService) {

		_creativeDirectorListinAddBoxLocalService =
			creativeDirectorListinAddBoxLocalService;
	}

	private CreativeDirectorListinAddBoxLocalService
		_creativeDirectorListinAddBoxLocalService;

}