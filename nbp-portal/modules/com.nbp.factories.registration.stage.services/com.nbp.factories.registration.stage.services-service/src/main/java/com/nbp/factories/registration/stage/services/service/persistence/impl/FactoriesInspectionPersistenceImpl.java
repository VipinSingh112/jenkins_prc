/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence.impl;

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

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesInspectionException;
import com.nbp.factories.registration.stage.services.model.FactoriesInspection;
import com.nbp.factories.registration.stage.services.model.FactoriesInspectionTable;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionImpl;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesInspectionPersistence;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesInspectionUtil;
import com.nbp.factories.registration.stage.services.service.persistence.impl.constants.FACTORIES_REGISTRATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the factories inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesInspectionPersistence.class)
public class FactoriesInspectionPersistenceImpl
	extends BasePersistenceImpl<FactoriesInspection>
	implements FactoriesInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesInspectionUtil</code> to access the factories inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactoryInspectionBy_CI;
	private FinderPath _finderPathCountBygetFactoryInspectionBy_CI;

	/**
	 * Returns the factories inspection where caseId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetFactoryInspectionBy_CI(String caseId)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetFactoryInspectionBy_CI(caseId);

		if (factoriesInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesInspectionException(sb.toString());
		}

		return factoriesInspection;
	}

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetFactoryInspectionBy_CI(String caseId) {
		return fetchBygetFactoryInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetFactoryInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoryInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof FactoriesInspection) {
			FactoriesInspection factoriesInspection =
				(FactoriesInspection)result;

			if (!Objects.equals(caseId, factoriesInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<FactoriesInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoryInspectionBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FactoriesInspectionPersistenceImpl.fetchBygetFactoryInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesInspection factoriesInspection = list.get(0);

					result = factoriesInspection;

					cacheResult(factoriesInspection);
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
			return (FactoriesInspection)result;
		}
	}

	/**
	 * Removes the factories inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories inspection that was removed
	 */
	@Override
	public FactoriesInspection removeBygetFactoryInspectionBy_CI(String caseId)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			findBygetFactoryInspectionBy_CI(caseId);

		return remove(factoriesInspection);
	}

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetFactoryInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoryInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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
		_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_2 =
			"factoriesInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORYINSPECTIONBY_CI_CASEID_3 =
			"(factoriesInspection.caseId IS NULL OR factoriesInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFI_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFI_FAI;
	private FinderPath _finderPathCountBygetFI_FAI;

	/**
	 * Returns all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId) {

		return findBygetFI_FAI(
			factoriesApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end) {

		return findBygetFI_FAI(factoriesApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findBygetFI_FAI(
			factoriesApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFI_FAI;
				finderArgs = new Object[] {factoriesApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFI_FAI;
			finderArgs = new Object[] {
				factoriesApplicationId, start, end, orderByComparator
			};
		}

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesInspection factoriesInspection : list) {
					if (factoriesApplicationId !=
							factoriesInspection.getFactoriesApplicationId()) {

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

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFI_FAI_FACTORIESAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetFI_FAI_First(
			long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetFI_FAI_First(
			factoriesApplicationId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetFI_FAI_First(
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		List<FactoriesInspection> list = findBygetFI_FAI(
			factoriesApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetFI_FAI_Last(
			long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetFI_FAI_Last(
			factoriesApplicationId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetFI_FAI_Last(
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		int count = countBygetFI_FAI(factoriesApplicationId);

		if (count == 0) {
			return null;
		}

		List<FactoriesInspection> list = findBygetFI_FAI(
			factoriesApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection[] findBygetFI_FAI_PrevAndNext(
			long factoriesInspectionId, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = findByPrimaryKey(
			factoriesInspectionId);

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection[] array = new FactoriesInspectionImpl[3];

			array[0] = getBygetFI_FAI_PrevAndNext(
				session, factoriesInspection, factoriesApplicationId,
				orderByComparator, true);

			array[1] = factoriesInspection;

			array[2] = getBygetFI_FAI_PrevAndNext(
				session, factoriesInspection, factoriesApplicationId,
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

	protected FactoriesInspection getBygetFI_FAI_PrevAndNext(
		Session session, FactoriesInspection factoriesInspection,
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETFI_FAI_FACTORIESAPPLICATIONID_2);

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
			sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(factoriesApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories inspections where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	@Override
	public void removeBygetFI_FAI(long factoriesApplicationId) {
		for (FactoriesInspection factoriesInspection :
				findBygetFI_FAI(
					factoriesApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetFI_FAI(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFI_FAI;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFI_FAI_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETFI_FAI_FACTORIESAPPLICATIONID_2 =
			"factoriesInspection.factoriesApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_CaseId;
	private FinderPath _finderPathCountBygetMI_CaseId;

	/**
	 * Returns all the factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseId(String caseId) {
		return findBygetMI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end) {

		return findBygetMI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findBygetMI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesInspection factoriesInspection : list) {
					if (!caseId.equals(factoriesInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseId_First(
			String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetMI_CaseId_First(
			caseId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseId_First(
		String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		List<FactoriesInspection> list = findBygetMI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseId_Last(
			String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetMI_CaseId_Last(
			caseId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseId_Last(
		String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		int count = countBygetMI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FactoriesInspection> list = findBygetMI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection[] findBygetMI_CaseId_PrevAndNext(
			long factoriesInspectionId, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		caseId = Objects.toString(caseId, "");

		FactoriesInspection factoriesInspection = findByPrimaryKey(
			factoriesInspectionId);

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection[] array = new FactoriesInspectionImpl[3];

			array[0] = getBygetMI_CaseId_PrevAndNext(
				session, factoriesInspection, caseId, orderByComparator, true);

			array[1] = factoriesInspection;

			array[2] = getBygetMI_CaseId_PrevAndNext(
				session, factoriesInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FactoriesInspection getBygetMI_CaseId_PrevAndNext(
		Session session, FactoriesInspection factoriesInspection, String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
		}

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
			sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMI_CaseId(String caseId) {
		for (FactoriesInspection factoriesInspection :
				findBygetMI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetMI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETMI_CASEID_CASEID_2 =
		"factoriesInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMI_CASEID_CASEID_3 =
		"(factoriesInspection.caseId IS NULL OR factoriesInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_Status;
	private FinderPath _finderPathCountBygetMI_Status;

	/**
	 * Returns all the factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_Status(String status) {
		return findBygetMI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end) {

		return findBygetMI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findBygetMI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesInspection factoriesInspection : list) {
					if (!status.equals(factoriesInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_Status_First(
			String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetMI_Status_First(
			status, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_Status_First(
		String status,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		List<FactoriesInspection> list = findBygetMI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_Status_Last(
			String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchBygetMI_Status_Last(
			status, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_Status_Last(
		String status,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		int count = countBygetMI_Status(status);

		if (count == 0) {
			return null;
		}

		List<FactoriesInspection> list = findBygetMI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection[] findBygetMI_Status_PrevAndNext(
			long factoriesInspectionId, String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		status = Objects.toString(status, "");

		FactoriesInspection factoriesInspection = findByPrimaryKey(
			factoriesInspectionId);

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection[] array = new FactoriesInspectionImpl[3];

			array[0] = getBygetMI_Status_PrevAndNext(
				session, factoriesInspection, status, orderByComparator, true);

			array[1] = factoriesInspection;

			array[2] = getBygetMI_Status_PrevAndNext(
				session, factoriesInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FactoriesInspection getBygetMI_Status_PrevAndNext(
		Session session, FactoriesInspection factoriesInspection, String status,
		OrderByComparator<FactoriesInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
		}

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
			sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMI_Status(String status) {
		for (FactoriesInspection factoriesInspection :
				findBygetMI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetMI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

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

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_2 =
		"factoriesInspection.status = ?";

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_3 =
		"(factoriesInspection.status IS NULL OR factoriesInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_CaseIdStatus;
	private FinderPath _finderPathCountBygetMI_CaseIdStatus;

	/**
	 * Returns all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId) {

		return findBygetMI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetMI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesInspection factoriesInspection : list) {
					if (!status.equals(factoriesInspection.getStatus()) ||
						!caseId.equals(factoriesInspection.getCaseId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetMI_CaseIdStatus_First(status, caseId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		List<FactoriesInspection> list = findBygetMI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetMI_CaseIdStatus_Last(status, caseId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		int count = countBygetMI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<FactoriesInspection> list = findBygetMI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long factoriesInspectionId, String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FactoriesInspection factoriesInspection = findByPrimaryKey(
			factoriesInspectionId);

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection[] array = new FactoriesInspectionImpl[3];

			array[0] = getBygetMI_CaseIdStatus_PrevAndNext(
				session, factoriesInspection, status, caseId, orderByComparator,
				true);

			array[1] = factoriesInspection;

			array[2] = getBygetMI_CaseIdStatus_PrevAndNext(
				session, factoriesInspection, status, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FactoriesInspection getBygetMI_CaseIdStatus_PrevAndNext(
		Session session, FactoriesInspection factoriesInspection, String status,
		String caseId, OrderByComparator<FactoriesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
		}

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
			sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMI_CaseIdStatus(String status, String caseId) {
		for (FactoriesInspection factoriesInspection :
				findBygetMI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetMI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_2 =
		"factoriesInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_STATUS_3 =
		"(factoriesInspection.status IS NULL OR factoriesInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_2 =
		"factoriesInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETMI_CASEIDSTATUS_CASEID_3 =
		"(factoriesInspection.caseId IS NULL OR factoriesInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetMI_CaseIdApplicationId;

	/**
	 * Returns all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		return findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end) {

		return findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	@Override
	public List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId;
				finderArgs = new Object[] {status, factoriesApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, factoriesApplicationId, start, end, orderByComparator
			};
		}

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesInspection factoriesInspection : list) {
					if (!status.equals(factoriesInspection.getStatus()) ||
						(factoriesApplicationId !=
							factoriesInspection.getFactoriesApplicationId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_FACTORIESAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(factoriesApplicationId);

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseIdApplicationId_First(
			String status, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetMI_CaseIdApplicationId_First(
				status, factoriesApplicationId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		List<FactoriesInspection> list = findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetMI_CaseIdApplicationId_Last(
				status, factoriesApplicationId, orderByComparator);

		if (factoriesInspection != null) {
			return factoriesInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", factoriesApplicationId=");
		sb.append(factoriesApplicationId);

		sb.append("}");

		throw new NoSuchFactoriesInspectionException(sb.toString());
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		int count = countBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId);

		if (count == 0) {
			return null;
		}

		List<FactoriesInspection> list = findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection[] findBygetMI_CaseIdApplicationId_PrevAndNext(
			long factoriesInspectionId, String status,
			long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws NoSuchFactoriesInspectionException {

		status = Objects.toString(status, "");

		FactoriesInspection factoriesInspection = findByPrimaryKey(
			factoriesInspectionId);

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection[] array = new FactoriesInspectionImpl[3];

			array[0] = getBygetMI_CaseIdApplicationId_PrevAndNext(
				session, factoriesInspection, status, factoriesApplicationId,
				orderByComparator, true);

			array[1] = factoriesInspection;

			array[2] = getBygetMI_CaseIdApplicationId_PrevAndNext(
				session, factoriesInspection, status, factoriesApplicationId,
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

	protected FactoriesInspection getBygetMI_CaseIdApplicationId_PrevAndNext(
		Session session, FactoriesInspection factoriesInspection, String status,
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_FACTORIESAPPLICATIONID_2);

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
			sb.append(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(factoriesApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						factoriesInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories inspections where status = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 */
	@Override
	public void removeBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		for (FactoriesInspection factoriesInspection :
				findBygetMI_CaseIdApplicationId(
					status, factoriesApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_2 =
			"factoriesInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_STATUS_3 =
			"(factoriesInspection.status IS NULL OR factoriesInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMI_CASEIDAPPLICATIONID_FACTORIESAPPLICATIONID_2 =
			"factoriesInspection.factoriesApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);

		if (factoriesInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesInspectionException(sb.toString());
		}

		return factoriesInspection;
	}

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, factoriesApplicationId, true);
	}

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	@Override
	public FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, factoriesApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof FactoriesInspection) {
			FactoriesInspection factoriesInspection =
				(FactoriesInspection)result;

			if (!Objects.equals(status, factoriesInspection.getStatus()) ||
				(slotBookedByUser !=
					factoriesInspection.getSlotBookedByUser()) ||
				(factoriesApplicationId !=
					factoriesInspection.getFactoriesApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(factoriesApplicationId);

				List<FactoriesInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser,
									factoriesApplicationId
								};
							}

							_log.warn(
								"FactoriesInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesInspection factoriesInspection = list.get(0);

					result = factoriesInspection;

					cacheResult(factoriesInspection);
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
			return (FactoriesInspection)result;
		}
	}

	/**
	 * Removes the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories inspection that was removed
	 */
	@Override
	public FactoriesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);

		return remove(factoriesInspection);
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long factoriesApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, factoriesApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FACTORIESINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"factoriesInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(factoriesInspection.status IS NULL OR factoriesInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"factoriesInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FACTORIESAPPLICATIONID_2 =
			"factoriesInspection.factoriesApplicationId = ?";

	public FactoriesInspectionPersistenceImpl() {
		setModelClass(FactoriesInspection.class);

		setModelImplClass(FactoriesInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesInspectionTable.INSTANCE);
	}

	/**
	 * Caches the factories inspection in the entity cache if it is enabled.
	 *
	 * @param factoriesInspection the factories inspection
	 */
	@Override
	public void cacheResult(FactoriesInspection factoriesInspection) {
		entityCache.putResult(
			FactoriesInspectionImpl.class, factoriesInspection.getPrimaryKey(),
			factoriesInspection);

		finderCache.putResult(
			_finderPathFetchBygetFactoryInspectionBy_CI,
			new Object[] {factoriesInspection.getCaseId()},
			factoriesInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				factoriesInspection.getStatus(),
				factoriesInspection.getSlotBookedByUser(),
				factoriesInspection.getFactoriesApplicationId()
			},
			factoriesInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories inspections in the entity cache if it is enabled.
	 *
	 * @param factoriesInspections the factories inspections
	 */
	@Override
	public void cacheResult(List<FactoriesInspection> factoriesInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesInspection factoriesInspection : factoriesInspections) {
			if (entityCache.getResult(
					FactoriesInspectionImpl.class,
					factoriesInspection.getPrimaryKey()) == null) {

				cacheResult(factoriesInspection);
			}
		}
	}

	/**
	 * Clears the cache for all factories inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesInspectionImpl.class);

		finderCache.clearCache(FactoriesInspectionImpl.class);
	}

	/**
	 * Clears the cache for the factories inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FactoriesInspection factoriesInspection) {
		entityCache.removeResult(
			FactoriesInspectionImpl.class, factoriesInspection);
	}

	@Override
	public void clearCache(List<FactoriesInspection> factoriesInspections) {
		for (FactoriesInspection factoriesInspection : factoriesInspections) {
			entityCache.removeResult(
				FactoriesInspectionImpl.class, factoriesInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FactoriesInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesInspectionModelImpl factoriesInspectionModelImpl) {

		Object[] args = new Object[] {factoriesInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetFactoryInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoryInspectionBy_CI, args,
			factoriesInspectionModelImpl);

		args = new Object[] {
			factoriesInspectionModelImpl.getStatus(),
			factoriesInspectionModelImpl.getSlotBookedByUser(),
			factoriesInspectionModelImpl.getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, factoriesInspectionModelImpl);
	}

	/**
	 * Creates a new factories inspection with the primary key. Does not add the factories inspection to the database.
	 *
	 * @param factoriesInspectionId the primary key for the new factories inspection
	 * @return the new factories inspection
	 */
	@Override
	public FactoriesInspection create(long factoriesInspectionId) {
		FactoriesInspection factoriesInspection = new FactoriesInspectionImpl();

		factoriesInspection.setNew(true);
		factoriesInspection.setPrimaryKey(factoriesInspectionId);

		factoriesInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return factoriesInspection;
	}

	/**
	 * Removes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection remove(long factoriesInspectionId)
		throws NoSuchFactoriesInspectionException {

		return remove((Serializable)factoriesInspectionId);
	}

	/**
	 * Removes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection remove(Serializable primaryKey)
		throws NoSuchFactoriesInspectionException {

		Session session = null;

		try {
			session = openSession();

			FactoriesInspection factoriesInspection =
				(FactoriesInspection)session.get(
					FactoriesInspectionImpl.class, primaryKey);

			if (factoriesInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesInspection);
		}
		catch (NoSuchFactoriesInspectionException noSuchEntityException) {
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
	protected FactoriesInspection removeImpl(
		FactoriesInspection factoriesInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesInspection)) {
				factoriesInspection = (FactoriesInspection)session.get(
					FactoriesInspectionImpl.class,
					factoriesInspection.getPrimaryKeyObj());
			}

			if (factoriesInspection != null) {
				session.delete(factoriesInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesInspection != null) {
			clearCache(factoriesInspection);
		}

		return factoriesInspection;
	}

	@Override
	public FactoriesInspection updateImpl(
		FactoriesInspection factoriesInspection) {

		boolean isNew = factoriesInspection.isNew();

		if (!(factoriesInspection instanceof FactoriesInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesInspection implementation " +
					factoriesInspection.getClass());
		}

		FactoriesInspectionModelImpl factoriesInspectionModelImpl =
			(FactoriesInspectionModelImpl)factoriesInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesInspection.setCreateDate(date);
			}
			else {
				factoriesInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesInspection.setModifiedDate(date);
			}
			else {
				factoriesInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesInspection);
			}
			else {
				factoriesInspection = (FactoriesInspection)session.merge(
					factoriesInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesInspectionImpl.class, factoriesInspectionModelImpl, false,
			true);

		cacheUniqueFindersCache(factoriesInspectionModelImpl);

		if (isNew) {
			factoriesInspection.setNew(false);
		}

		factoriesInspection.resetOriginalValues();

		return factoriesInspection;
	}

	/**
	 * Returns the factories inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesInspectionException {

		FactoriesInspection factoriesInspection = fetchByPrimaryKey(primaryKey);

		if (factoriesInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesInspection;
	}

	/**
	 * Returns the factories inspection with the primary key or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection findByPrimaryKey(long factoriesInspectionId)
		throws NoSuchFactoriesInspectionException {

		return findByPrimaryKey((Serializable)factoriesInspectionId);
	}

	/**
	 * Returns the factories inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection, or <code>null</code> if a factories inspection with the primary key could not be found
	 */
	@Override
	public FactoriesInspection fetchByPrimaryKey(long factoriesInspectionId) {
		return fetchByPrimaryKey((Serializable)factoriesInspectionId);
	}

	/**
	 * Returns all the factories inspections.
	 *
	 * @return the factories inspections
	 */
	@Override
	public List<FactoriesInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of factories inspections
	 */
	@Override
	public List<FactoriesInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories inspections
	 */
	@Override
	public List<FactoriesInspection> findAll(
		int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories inspections
	 */
	@Override
	public List<FactoriesInspection> findAll(
		int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
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

		List<FactoriesInspection> list = null;

		if (useFinderCache) {
			list = (List<FactoriesInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESINSPECTION;

				sql = sql.concat(FactoriesInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesInspection>)QueryUtil.list(
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
	 * Removes all the factories inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesInspection factoriesInspection : findAll()) {
			remove(factoriesInspection);
		}
	}

	/**
	 * Returns the number of factories inspections.
	 *
	 * @return the number of factories inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FACTORIESINSPECTION);

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
		return "factoriesInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories inspection persistence.
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

		_finderPathFetchBygetFactoryInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoryInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactoryInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoryInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFI_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFI_FAI",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFI_FAI",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		_finderPathWithPaginationFindBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetMI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetMI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "factoriesApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetMI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "factoriesApplicationId"}, true);

		_finderPathCountBygetMI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "factoriesApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "factoriesApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "factoriesApplicationId"
				},
				false);

		FactoriesInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesInspectionUtil.setPersistence(null);

		entityCache.removeCache(FactoriesInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESINSPECTION =
		"SELECT factoriesInspection FROM FactoriesInspection factoriesInspection";

	private static final String _SQL_SELECT_FACTORIESINSPECTION_WHERE =
		"SELECT factoriesInspection FROM FactoriesInspection factoriesInspection WHERE ";

	private static final String _SQL_COUNT_FACTORIESINSPECTION =
		"SELECT COUNT(factoriesInspection) FROM FactoriesInspection factoriesInspection";

	private static final String _SQL_COUNT_FACTORIESINSPECTION_WHERE =
		"SELECT COUNT(factoriesInspection) FROM FactoriesInspection factoriesInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "factoriesInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}