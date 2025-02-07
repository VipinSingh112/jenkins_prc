/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.manufacturing.application.form.service.exception.NoSuchProductionProcessException;
import com.nbp.manufacturing.application.form.service.model.ProductionProcess;
import com.nbp.manufacturing.application.form.service.model.ProductionProcessTable;
import com.nbp.manufacturing.application.form.service.model.impl.ProductionProcessImpl;
import com.nbp.manufacturing.application.form.service.model.impl.ProductionProcessModelImpl;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessPersistence;
import com.nbp.manufacturing.application.form.service.service.persistence.ProductionProcessUtil;
import com.nbp.manufacturing.application.form.service.service.persistence.impl.constants.MANUFACTURINGPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the production process service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ProductionProcessPersistence.class)
public class ProductionProcessPersistenceImpl
	extends BasePersistenceImpl<ProductionProcess>
	implements ProductionProcessPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ProductionProcessUtil</code> to access the production process persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ProductionProcessImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetManufactureById;
	private FinderPath _finderPathCountBygetManufactureById;

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	@Override
	public ProductionProcess findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = fetchBygetManufactureById(
			manufacturingApplicationId);

		if (productionProcess == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchProductionProcessException(sb.toString());
		}

		return productionProcess;
	}

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	@Override
	public ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return fetchBygetManufactureById(manufacturingApplicationId, true);
	}

	/**
	 * Returns the production process where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching production process, or <code>null</code> if a matching production process could not be found
	 */
	@Override
	public ProductionProcess fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetManufactureById, finderArgs, this);
		}

		if (result instanceof ProductionProcess) {
			ProductionProcess productionProcess = (ProductionProcess)result;

			if (manufacturingApplicationId !=
					productionProcess.getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PRODUCTIONPROCESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ProductionProcess> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetManufactureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ProductionProcessPersistenceImpl.fetchBygetManufactureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ProductionProcess productionProcess = list.get(0);

					result = productionProcess;

					cacheResult(productionProcess);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ProductionProcess)result;
		}
	}

	/**
	 * Removes the production process where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the production process that was removed
	 */
	@Override
	public ProductionProcess removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = findBygetManufactureById(
			manufacturingApplicationId);

		return remove(productionProcess);
	}

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	@Override
	public int countBygetManufactureById(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetManufactureById;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIONPROCESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMANUFACTUREBYID_MANUFACTURINGAPPLICATIONID_2 =
			"productionProcess.manufacturingApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMA_PDP_MAI;
	private FinderPath _finderPathWithoutPaginationFindBygetMA_PDP_MAI;
	private FinderPath _finderPathCountBygetMA_PDP_MAI;

	/**
	 * Returns all the production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching production processes
	 */
	@Override
	public List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId) {

		return findBygetMA_PDP_MAI(
			manufacturingApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

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
	@Override
	public List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end) {

		return findBygetMA_PDP_MAI(
			manufacturingApplicationId, start, end, null);
	}

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
	@Override
	public List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return findBygetMA_PDP_MAI(
			manufacturingApplicationId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ProductionProcess> findBygetMA_PDP_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMA_PDP_MAI;
				finderArgs = new Object[] {manufacturingApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMA_PDP_MAI;
			finderArgs = new Object[] {
				manufacturingApplicationId, start, end, orderByComparator
			};
		}

		List<ProductionProcess> list = null;

		if (useFinderCache) {
			list = (List<ProductionProcess>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ProductionProcess productionProcess : list) {
					if (manufacturingApplicationId !=
							productionProcess.getManufacturingApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_PRODUCTIONPROCESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMA_PDP_MAI_MANUFACTURINGAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ProductionProcessModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				list = (List<ProductionProcess>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	@Override
	public ProductionProcess findBygetMA_PDP_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = fetchBygetMA_PDP_MAI_First(
			manufacturingApplicationId, orderByComparator);

		if (productionProcess != null) {
			return productionProcess;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductionProcessException(sb.toString());
	}

	/**
	 * Returns the first production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching production process, or <code>null</code> if a matching production process could not be found
	 */
	@Override
	public ProductionProcess fetchBygetMA_PDP_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ProductionProcess> orderByComparator) {

		List<ProductionProcess> list = findBygetMA_PDP_MAI(
			manufacturingApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process
	 * @throws NoSuchProductionProcessException if a matching production process could not be found
	 */
	@Override
	public ProductionProcess findBygetMA_PDP_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = fetchBygetMA_PDP_MAI_Last(
			manufacturingApplicationId, orderByComparator);

		if (productionProcess != null) {
			return productionProcess;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("manufacturingApplicationId=");
		sb.append(manufacturingApplicationId);

		sb.append("}");

		throw new NoSuchProductionProcessException(sb.toString());
	}

	/**
	 * Returns the last production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching production process, or <code>null</code> if a matching production process could not be found
	 */
	@Override
	public ProductionProcess fetchBygetMA_PDP_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ProductionProcess> orderByComparator) {

		int count = countBygetMA_PDP_MAI(manufacturingApplicationId);

		if (count == 0) {
			return null;
		}

		List<ProductionProcess> list = findBygetMA_PDP_MAI(
			manufacturingApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the production processes before and after the current production process in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param productionProcessId the primary key of the current production process
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess[] findBygetMA_PDP_MAI_PrevAndNext(
			long productionProcessId, long manufacturingApplicationId,
			OrderByComparator<ProductionProcess> orderByComparator)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = findByPrimaryKey(
			productionProcessId);

		Session session = null;

		try {
			session = openSession();

			ProductionProcess[] array = new ProductionProcessImpl[3];

			array[0] = getBygetMA_PDP_MAI_PrevAndNext(
				session, productionProcess, manufacturingApplicationId,
				orderByComparator, true);

			array[1] = productionProcess;

			array[2] = getBygetMA_PDP_MAI_PrevAndNext(
				session, productionProcess, manufacturingApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ProductionProcess getBygetMA_PDP_MAI_PrevAndNext(
		Session session, ProductionProcess productionProcess,
		long manufacturingApplicationId,
		OrderByComparator<ProductionProcess> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PRODUCTIONPROCESS_WHERE);

		sb.append(_FINDER_COLUMN_GETMA_PDP_MAI_MANUFACTURINGAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ProductionProcessModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(manufacturingApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						productionProcess)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ProductionProcess> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the production processes where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	@Override
	public void removeBygetMA_PDP_MAI(long manufacturingApplicationId) {
		for (ProductionProcess productionProcess :
				findBygetMA_PDP_MAI(
					manufacturingApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(productionProcess);
		}
	}

	/**
	 * Returns the number of production processes where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching production processes
	 */
	@Override
	public int countBygetMA_PDP_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMA_PDP_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRODUCTIONPROCESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETMA_PDP_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETMA_PDP_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"productionProcess.manufacturingApplicationId = ?";

	public ProductionProcessPersistenceImpl() {
		setModelClass(ProductionProcess.class);

		setModelImplClass(ProductionProcessImpl.class);
		setModelPKClass(long.class);

		setTable(ProductionProcessTable.INSTANCE);
	}

	/**
	 * Caches the production process in the entity cache if it is enabled.
	 *
	 * @param productionProcess the production process
	 */
	@Override
	public void cacheResult(ProductionProcess productionProcess) {
		entityCache.putResult(
			ProductionProcessImpl.class, productionProcess.getPrimaryKey(),
			productionProcess);

		finderCache.putResult(
			_finderPathFetchBygetManufactureById,
			new Object[] {productionProcess.getManufacturingApplicationId()},
			productionProcess);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the production processes in the entity cache if it is enabled.
	 *
	 * @param productionProcesses the production processes
	 */
	@Override
	public void cacheResult(List<ProductionProcess> productionProcesses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (productionProcesses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ProductionProcess productionProcess : productionProcesses) {
			if (entityCache.getResult(
					ProductionProcessImpl.class,
					productionProcess.getPrimaryKey()) == null) {

				cacheResult(productionProcess);
			}
		}
	}

	/**
	 * Clears the cache for all production processes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ProductionProcessImpl.class);

		finderCache.clearCache(ProductionProcessImpl.class);
	}

	/**
	 * Clears the cache for the production process.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ProductionProcess productionProcess) {
		entityCache.removeResult(
			ProductionProcessImpl.class, productionProcess);
	}

	@Override
	public void clearCache(List<ProductionProcess> productionProcesses) {
		for (ProductionProcess productionProcess : productionProcesses) {
			entityCache.removeResult(
				ProductionProcessImpl.class, productionProcess);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ProductionProcessImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ProductionProcessImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ProductionProcessModelImpl productionProcessModelImpl) {

		Object[] args = new Object[] {
			productionProcessModelImpl.getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetManufactureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetManufactureById, args,
			productionProcessModelImpl);
	}

	/**
	 * Creates a new production process with the primary key. Does not add the production process to the database.
	 *
	 * @param productionProcessId the primary key for the new production process
	 * @return the new production process
	 */
	@Override
	public ProductionProcess create(long productionProcessId) {
		ProductionProcess productionProcess = new ProductionProcessImpl();

		productionProcess.setNew(true);
		productionProcess.setPrimaryKey(productionProcessId);

		productionProcess.setCompanyId(CompanyThreadLocal.getCompanyId());

		return productionProcess;
	}

	/**
	 * Removes the production process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process that was removed
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess remove(long productionProcessId)
		throws NoSuchProductionProcessException {

		return remove((Serializable)productionProcessId);
	}

	/**
	 * Removes the production process with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the production process
	 * @return the production process that was removed
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess remove(Serializable primaryKey)
		throws NoSuchProductionProcessException {

		Session session = null;

		try {
			session = openSession();

			ProductionProcess productionProcess =
				(ProductionProcess)session.get(
					ProductionProcessImpl.class, primaryKey);

			if (productionProcess == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchProductionProcessException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(productionProcess);
		}
		catch (NoSuchProductionProcessException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ProductionProcess removeImpl(
		ProductionProcess productionProcess) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(productionProcess)) {
				productionProcess = (ProductionProcess)session.get(
					ProductionProcessImpl.class,
					productionProcess.getPrimaryKeyObj());
			}

			if (productionProcess != null) {
				session.delete(productionProcess);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (productionProcess != null) {
			clearCache(productionProcess);
		}

		return productionProcess;
	}

	@Override
	public ProductionProcess updateImpl(ProductionProcess productionProcess) {
		boolean isNew = productionProcess.isNew();

		if (!(productionProcess instanceof ProductionProcessModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(productionProcess.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					productionProcess);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in productionProcess proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ProductionProcess implementation " +
					productionProcess.getClass());
		}

		ProductionProcessModelImpl productionProcessModelImpl =
			(ProductionProcessModelImpl)productionProcess;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (productionProcess.getCreateDate() == null)) {
			if (serviceContext == null) {
				productionProcess.setCreateDate(date);
			}
			else {
				productionProcess.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!productionProcessModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				productionProcess.setModifiedDate(date);
			}
			else {
				productionProcess.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(productionProcess);
			}
			else {
				productionProcess = (ProductionProcess)session.merge(
					productionProcess);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ProductionProcessImpl.class, productionProcessModelImpl, false,
			true);

		cacheUniqueFindersCache(productionProcessModelImpl);

		if (isNew) {
			productionProcess.setNew(false);
		}

		productionProcess.resetOriginalValues();

		return productionProcess;
	}

	/**
	 * Returns the production process with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the production process
	 * @return the production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess findByPrimaryKey(Serializable primaryKey)
		throws NoSuchProductionProcessException {

		ProductionProcess productionProcess = fetchByPrimaryKey(primaryKey);

		if (productionProcess == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchProductionProcessException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return productionProcess;
	}

	/**
	 * Returns the production process with the primary key or throws a <code>NoSuchProductionProcessException</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process
	 * @throws NoSuchProductionProcessException if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess findByPrimaryKey(long productionProcessId)
		throws NoSuchProductionProcessException {

		return findByPrimaryKey((Serializable)productionProcessId);
	}

	/**
	 * Returns the production process with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param productionProcessId the primary key of the production process
	 * @return the production process, or <code>null</code> if a production process with the primary key could not be found
	 */
	@Override
	public ProductionProcess fetchByPrimaryKey(long productionProcessId) {
		return fetchByPrimaryKey((Serializable)productionProcessId);
	}

	/**
	 * Returns all the production processes.
	 *
	 * @return the production processes
	 */
	@Override
	public List<ProductionProcess> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ProductionProcess> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ProductionProcess> findAll(
		int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ProductionProcess> findAll(
		int start, int end,
		OrderByComparator<ProductionProcess> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ProductionProcess> list = null;

		if (useFinderCache) {
			list = (List<ProductionProcess>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PRODUCTIONPROCESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PRODUCTIONPROCESS;

				sql = sql.concat(ProductionProcessModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ProductionProcess>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the production processes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ProductionProcess productionProcess : findAll()) {
			remove(productionProcess);
		}
	}

	/**
	 * Returns the number of production processes.
	 *
	 * @return the number of production processes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PRODUCTIONPROCESS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "productionProcessId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PRODUCTIONPROCESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ProductionProcessModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the production process persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetManufactureById",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetManufactureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetManufactureById", new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathWithPaginationFindBygetMA_PDP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMA_PDP_MAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMA_PDP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMA_PDP_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMA_PDP_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMA_PDP_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		ProductionProcessUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ProductionProcessUtil.setPersistence(null);

		entityCache.removeCache(ProductionProcessImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURINGPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PRODUCTIONPROCESS =
		"SELECT productionProcess FROM ProductionProcess productionProcess";

	private static final String _SQL_SELECT_PRODUCTIONPROCESS_WHERE =
		"SELECT productionProcess FROM ProductionProcess productionProcess WHERE ";

	private static final String _SQL_COUNT_PRODUCTIONPROCESS =
		"SELECT COUNT(productionProcess) FROM ProductionProcess productionProcess";

	private static final String _SQL_COUNT_PRODUCTIONPROCESS_WHERE =
		"SELECT COUNT(productionProcess) FROM ProductionProcess productionProcess WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "productionProcess.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ProductionProcess exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ProductionProcess exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ProductionProcessPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}