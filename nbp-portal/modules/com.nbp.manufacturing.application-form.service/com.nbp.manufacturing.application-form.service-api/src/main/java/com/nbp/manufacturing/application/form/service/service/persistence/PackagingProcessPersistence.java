/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchPackagingProcessException;
import com.nbp.manufacturing.application.form.service.model.PackagingProcess;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the packaging process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PackagingProcessUtil
 * @generated
 */
@ProviderType
public interface PackagingProcessPersistence
	extends BasePersistence<PackagingProcess> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PackagingProcessUtil} to access the packaging process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public PackagingProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchPackagingProcessException;

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public PackagingProcess fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the packaging process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public PackagingProcess fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the packaging process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the packaging process that was removed
	 */
	public PackagingProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchPackagingProcessException;

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching packaging processes
	 */
	public java.util.List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of matching packaging processes
	 */
	public java.util.List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching packaging processes
	 */
	public java.util.List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator);

	/**
	 * Returns an ordered range of all the packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching packaging processes
	 */
	public java.util.List<PackagingProcess> findBygetMA_PP_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public PackagingProcess findBygetMA_PP_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
				orderByComparator)
		throws NoSuchPackagingProcessException;

	/**
	 * Returns the first packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public PackagingProcess fetchBygetMA_PP_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator);

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process
	 * @throws NoSuchPackagingProcessException if a matching packaging process could not be found
	 */
	public PackagingProcess findBygetMA_PP_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
				orderByComparator)
		throws NoSuchPackagingProcessException;

	/**
	 * Returns the last packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching packaging process, or <code>null</code> if a matching packaging process could not be found
	 */
	public PackagingProcess fetchBygetMA_PP_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator);

	/**
	 * Returns the packaging processes before and after the current packaging process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param packagingProcessId the primary key of the current packaging process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public PackagingProcess[] findBygetMA_PP_MAI_PrevAndNext(
			long packagingProcessId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
				orderByComparator)
		throws NoSuchPackagingProcessException;

	/**
	 * Removes all the packaging processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_PP_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of packaging processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching packaging processes
	 */
	public int countBygetMA_PP_MAI(long manufacturingApplicationId);

	/**
	 * Caches the packaging process in the entity cache if it is enabled.
	 *
	 * @param packagingProcess the packaging process
	 */
	public void cacheResult(PackagingProcess packagingProcess);

	/**
	 * Caches the packaging processes in the entity cache if it is enabled.
	 *
	 * @param packagingProcesses the packaging processes
	 */
	public void cacheResult(
		java.util.List<PackagingProcess> packagingProcesses);

	/**
	 * Creates a new packaging process with the primary key. Does not add the packaging process to the database.
	 *
	 * @param packagingProcessId the primary key for the new packaging process
	 * @return the new packaging process
	 */
	public PackagingProcess create(long packagingProcessId);

	/**
	 * Removes the packaging process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process that was removed
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public PackagingProcess remove(long packagingProcessId)
		throws NoSuchPackagingProcessException;

	public PackagingProcess updateImpl(PackagingProcess packagingProcess);

	/**
	 * Returns the packaging process with the primary key or throws a <code>NoSuchPackagingProcessException</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process
	 * @throws NoSuchPackagingProcessException if a packaging process with the primary key could not be found
	 */
	public PackagingProcess findByPrimaryKey(long packagingProcessId)
		throws NoSuchPackagingProcessException;

	/**
	 * Returns the packaging process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param packagingProcessId the primary key of the packaging process
	 * @return the packaging process, or <code>null</code> if a packaging process with the primary key could not be found
	 */
	public PackagingProcess fetchByPrimaryKey(long packagingProcessId);

	/**
	 * Returns all the packaging processes.
	 *
	 * @return the packaging processes
	 */
	public java.util.List<PackagingProcess> findAll();

	/**
	 * Returns a range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @return the range of packaging processes
	 */
	public java.util.List<PackagingProcess> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of packaging processes
	 */
	public java.util.List<PackagingProcess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator);

	/**
	 * Returns an ordered range of all the packaging processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PackagingProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of packaging processes
	 * @param end the upper bound of the range of packaging processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of packaging processes
	 */
	public java.util.List<PackagingProcess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PackagingProcess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the packaging processes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of packaging processes.
	 *
	 * @return the number of packaging processes
	 */
	public int countAll();

}