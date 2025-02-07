/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionWaterEmployeeException;
import com.nbp.jtb.application.form.service.model.AttractionWaterEmployee;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the attraction water employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterEmployeeUtil
 * @generated
 */
@ProviderType
public interface AttractionWaterEmployeePersistence
	extends BasePersistence<AttractionWaterEmployee> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttractionWaterEmployeeUtil} to access the attraction water employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a matching attraction water employee could not be found
	 */
	public AttractionWaterEmployee findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterEmployeeException;

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	public AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the attraction water employee where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water employee, or <code>null</code> if a matching attraction water employee could not be found
	 */
	public AttractionWaterEmployee fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the attraction water employee where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water employee that was removed
	 */
	public AttractionWaterEmployee removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionWaterEmployeeException;

	/**
	 * Returns the number of attraction water employees where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water employees
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the attraction water employee in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployee the attraction water employee
	 */
	public void cacheResult(AttractionWaterEmployee attractionWaterEmployee);

	/**
	 * Caches the attraction water employees in the entity cache if it is enabled.
	 *
	 * @param attractionWaterEmployees the attraction water employees
	 */
	public void cacheResult(
		java.util.List<AttractionWaterEmployee> attractionWaterEmployees);

	/**
	 * Creates a new attraction water employee with the primary key. Does not add the attraction water employee to the database.
	 *
	 * @param attractionWaterEmpLicId the primary key for the new attraction water employee
	 * @return the new attraction water employee
	 */
	public AttractionWaterEmployee create(long attractionWaterEmpLicId);

	/**
	 * Removes the attraction water employee with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee that was removed
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	public AttractionWaterEmployee remove(long attractionWaterEmpLicId)
		throws NoSuchAttractionWaterEmployeeException;

	public AttractionWaterEmployee updateImpl(
		AttractionWaterEmployee attractionWaterEmployee);

	/**
	 * Returns the attraction water employee with the primary key or throws a <code>NoSuchAttractionWaterEmployeeException</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee
	 * @throws NoSuchAttractionWaterEmployeeException if a attraction water employee with the primary key could not be found
	 */
	public AttractionWaterEmployee findByPrimaryKey(
			long attractionWaterEmpLicId)
		throws NoSuchAttractionWaterEmployeeException;

	/**
	 * Returns the attraction water employee with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterEmpLicId the primary key of the attraction water employee
	 * @return the attraction water employee, or <code>null</code> if a attraction water employee with the primary key could not be found
	 */
	public AttractionWaterEmployee fetchByPrimaryKey(
		long attractionWaterEmpLicId);

	/**
	 * Returns all the attraction water employees.
	 *
	 * @return the attraction water employees
	 */
	public java.util.List<AttractionWaterEmployee> findAll();

	/**
	 * Returns a range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @return the range of attraction water employees
	 */
	public java.util.List<AttractionWaterEmployee> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water employees
	 */
	public java.util.List<AttractionWaterEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterEmployee> orderByComparator);

	/**
	 * Returns an ordered range of all the attraction water employees.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterEmployeeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water employees
	 * @param end the upper bound of the range of attraction water employees (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water employees
	 */
	public java.util.List<AttractionWaterEmployee> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AttractionWaterEmployee> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the attraction water employees from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of attraction water employees.
	 *
	 * @return the number of attraction water employees
	 */
	public int countAll();

}