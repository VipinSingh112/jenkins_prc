/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductionProcessException;
import com.nbp.manufacturing.application.form.service.model.ProductionProcess;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the production process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductionProcessUtil
 * @generated
 */
@ProviderType
public interface ProductionProcessPersistence
	extends BasePersistence<ProductionProcess> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductionProcessUtil} to access the production process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public ProductionProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductionProcessException;

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the production process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the production process that was removed
	 */
	public ProductionProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductionProcessException;

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Returns all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production processes
	 */
	public java.util.List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId);

	/**
	 * Returns a range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @return the range of matching production processes
	 */
	public java.util.List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching production processes
	 */
	public java.util.List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator);

	/**
	 * Returns an ordered range of all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching production processes
	 */
	public java.util.List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public ProductionProcess findBygetMA_PDP_MAI_First(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
				orderByComparator)
		throws NoSuchProductionProcessException;

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public ProductionProcess fetchBygetMA_PDP_MAI_First(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator);

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	public ProductionProcess findBygetMA_PDP_MAI_Last(
			long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
				orderByComparator)
		throws NoSuchProductionProcessException;

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process, or <code>null</code> if a matching production process could not be found
	 */
	public ProductionProcess fetchBygetMA_PDP_MAI_Last(
		long manufacturingApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator);

	/**
	 * Returns the production processes before and after the current production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productionProcessId the primary key of the current production process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public ProductionProcess[] findBygetMA_PDP_MAI_PrevAndNext(
			long productionProcessId, long manufacturingApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
				orderByComparator)
		throws NoSuchProductionProcessException;

	/**
	 * Removes all the production processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public void removeBygetMA_PDP_MAI(long manufacturingApplicationId);

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	public int countBygetMA_PDP_MAI(long manufacturingApplicationId);

	/**
	 * Caches the production process in the entity cache if it is enabled.
	 *
	 * @param productionProcess the production process
	 */
	public void cacheResult(ProductionProcess productionProcess);

	/**
	 * Caches the production processes in the entity cache if it is enabled.
	 *
	 * @param productionProcesses the production processes
	 */
	public void cacheResult(
		java.util.List<ProductionProcess> productionProcesses);

	/**
	 * Creates a new production process with the primary key. Does not add the production process to the database.
	 *
	 * @param productionProcessId the primary key for the new production process
	 * @return the new production process
	 */
	public ProductionProcess create(long productionProcessId);

	/**
	 * Removes the production process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process that was removed
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public ProductionProcess remove(long productionProcessId)
		throws NoSuchProductionProcessException;

	public ProductionProcess updateImpl(ProductionProcess productionProcess);

	/**
	 * Returns the production process with the primary key or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	public ProductionProcess findByPrimaryKey(long productionProcessId)
		throws NoSuchProductionProcessException;

	/**
	 * Returns the production process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process, or <code>null</code> if a production process with the primary key could not be found
	 */
	public ProductionProcess fetchByPrimaryKey(long productionProcessId);

	/**
	 * Returns all the production processes.
	 *
	 * @return the production processes
	 */
	public java.util.List<ProductionProcess> findAll();

	/**
	 * Returns a range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @return the range of production processes
	 */
	public java.util.List<ProductionProcess> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of production processes
	 */
	public java.util.List<ProductionProcess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator);

	/**
	 * Returns an ordered range of all the production processes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductionProcessModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of production processes
	 * @param end the upper bound of the range of production processes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of production processes
	 */
	public java.util.List<ProductionProcess> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ProductionProcess>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the production processes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of production processes.
	 *
	 * @return the number of production processes
	 */
	public int countAll();

}