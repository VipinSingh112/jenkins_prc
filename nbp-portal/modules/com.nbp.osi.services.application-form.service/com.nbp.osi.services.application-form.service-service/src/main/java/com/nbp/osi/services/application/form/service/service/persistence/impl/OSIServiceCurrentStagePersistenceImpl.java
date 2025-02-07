/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceCurrentStageException;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStage;
import com.nbp.osi.services.application.form.service.model.OSIServiceCurrentStageTable;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageImpl;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceCurrentStageModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceCurrentStagePersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceCurrentStageUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi service current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OSIServiceCurrentStagePersistence.class)
public class OSIServiceCurrentStagePersistenceImpl
	extends BasePersistenceImpl<OSIServiceCurrentStage>
	implements OSIServiceCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OSIServiceCurrentStageUtil</code> to access the osi service current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OSIServiceCurrentStageImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIService_ById;
	private FinderPath _finderPathCountBygetOSIService_ById;

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage =
			fetchBygetOSIService_ById(osiServicesApplicationId);

		if (osiServiceCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOSIServiceCurrentStageException(sb.toString());
		}

		return osiServiceCurrentStage;
	}

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return fetchBygetOSIService_ById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi service current stage where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIService_ById, finderArgs, this);
		}

		if (result instanceof OSIServiceCurrentStage) {
			OSIServiceCurrentStage osiServiceCurrentStage =
				(OSIServiceCurrentStage)result;

			if (osiServicesApplicationId !=
					osiServiceCurrentStage.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICECURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OSIServiceCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIService_ById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OSIServiceCurrentStagePersistenceImpl.fetchBygetOSIService_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServiceCurrentStage osiServiceCurrentStage = list.get(0);

					result = osiServiceCurrentStage;

					cacheResult(osiServiceCurrentStage);
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
			return (OSIServiceCurrentStage)result;
		}
	}

	/**
	 * Removes the osi service current stage where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service current stage that was removed
	 */
	@Override
	public OSIServiceCurrentStage removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage =
			findBygetOSIService_ById(osiServicesApplicationId);

		return remove(osiServiceCurrentStage);
	}

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	@Override
	public int countBygetOSIService_ById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSIService_ById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICECURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2 =
			"osiServiceCurrentStage.osiServicesApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOSI_CS_OSIAI;
	private FinderPath _finderPathWithoutPaginationFindBygetOSI_CS_OSIAI;
	private FinderPath _finderPathCountBygetOSI_CS_OSIAI;

	/**
	 * Returns all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId) {

		return findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of matching osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end) {

		return findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findBygetOSI_CS_OSIAI(
		long osiServicesApplicationId, int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOSI_CS_OSIAI;
				finderArgs = new Object[] {osiServicesApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSI_CS_OSIAI;
			finderArgs = new Object[] {
				osiServicesApplicationId, start, end, orderByComparator
			};
		}

		List<OSIServiceCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OSIServiceCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OSIServiceCurrentStage osiServiceCurrentStage : list) {
					if (osiServicesApplicationId !=
							osiServiceCurrentStage.
								getOsiServicesApplicationId()) {

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

			sb.append(_SQL_SELECT_OSISERVICECURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSI_CS_OSIAI_OSISERVICESAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OSIServiceCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				list = (List<OSIServiceCurrentStage>)QueryUtil.list(
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
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage findBygetOSI_CS_OSIAI_First(
			long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage =
			fetchBygetOSI_CS_OSIAI_First(
				osiServicesApplicationId, orderByComparator);

		if (osiServiceCurrentStage != null) {
			return osiServiceCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);

		sb.append("}");

		throw new NoSuchOSIServiceCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_First(
		long osiServicesApplicationId,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		List<OSIServiceCurrentStage> list = findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage findBygetOSI_CS_OSIAI_Last(
			long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage =
			fetchBygetOSI_CS_OSIAI_Last(
				osiServicesApplicationId, orderByComparator);

		if (osiServiceCurrentStage != null) {
			return osiServiceCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiServicesApplicationId=");
		sb.append(osiServicesApplicationId);

		sb.append("}");

		throw new NoSuchOSIServiceCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi service current stage, or <code>null</code> if a matching osi service current stage could not be found
	 */
	@Override
	public OSIServiceCurrentStage fetchBygetOSI_CS_OSIAI_Last(
		long osiServicesApplicationId,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		int count = countBygetOSI_CS_OSIAI(osiServicesApplicationId);

		if (count == 0) {
			return null;
		}

		List<OSIServiceCurrentStage> list = findBygetOSI_CS_OSIAI(
			osiServicesApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi service current stages before and after the current osi service current stage in the ordered set where osiServicesApplicationId = &#63;.
	 *
	 * @param osiCurrentStageId the primary key of the current osi service current stage
	 * @param osiServicesApplicationId the osi services application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage[] findBygetOSI_CS_OSIAI_PrevAndNext(
			long osiCurrentStageId, long osiServicesApplicationId,
			OrderByComparator<OSIServiceCurrentStage> orderByComparator)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage = findByPrimaryKey(
			osiCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			OSIServiceCurrentStage[] array = new OSIServiceCurrentStageImpl[3];

			array[0] = getBygetOSI_CS_OSIAI_PrevAndNext(
				session, osiServiceCurrentStage, osiServicesApplicationId,
				orderByComparator, true);

			array[1] = osiServiceCurrentStage;

			array[2] = getBygetOSI_CS_OSIAI_PrevAndNext(
				session, osiServiceCurrentStage, osiServicesApplicationId,
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

	protected OSIServiceCurrentStage getBygetOSI_CS_OSIAI_PrevAndNext(
		Session session, OSIServiceCurrentStage osiServiceCurrentStage,
		long osiServicesApplicationId,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICECURRENTSTAGE_WHERE);

		sb.append(_FINDER_COLUMN_GETOSI_CS_OSIAI_OSISERVICESAPPLICATIONID_2);

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
			sb.append(OSIServiceCurrentStageModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiServicesApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiServiceCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OSIServiceCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi service current stages where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 */
	@Override
	public void removeBygetOSI_CS_OSIAI(long osiServicesApplicationId) {
		for (OSIServiceCurrentStage osiServiceCurrentStage :
				findBygetOSI_CS_OSIAI(
					osiServicesApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiServiceCurrentStage);
		}
	}

	/**
	 * Returns the number of osi service current stages where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service current stages
	 */
	@Override
	public int countBygetOSI_CS_OSIAI(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSI_CS_OSIAI;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICECURRENTSTAGE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSI_CS_OSIAI_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSI_CS_OSIAI_OSISERVICESAPPLICATIONID_2 =
			"osiServiceCurrentStage.osiServicesApplicationId = ?";

	public OSIServiceCurrentStagePersistenceImpl() {
		setModelClass(OSIServiceCurrentStage.class);

		setModelImplClass(OSIServiceCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(OSIServiceCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the osi service current stage in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStage the osi service current stage
	 */
	@Override
	public void cacheResult(OSIServiceCurrentStage osiServiceCurrentStage) {
		entityCache.putResult(
			OSIServiceCurrentStageImpl.class,
			osiServiceCurrentStage.getPrimaryKey(), osiServiceCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById,
			new Object[] {osiServiceCurrentStage.getOsiServicesApplicationId()},
			osiServiceCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi service current stages in the entity cache if it is enabled.
	 *
	 * @param osiServiceCurrentStages the osi service current stages
	 */
	@Override
	public void cacheResult(
		List<OSIServiceCurrentStage> osiServiceCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServiceCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OSIServiceCurrentStage osiServiceCurrentStage :
				osiServiceCurrentStages) {

			if (entityCache.getResult(
					OSIServiceCurrentStageImpl.class,
					osiServiceCurrentStage.getPrimaryKey()) == null) {

				cacheResult(osiServiceCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all osi service current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OSIServiceCurrentStageImpl.class);

		finderCache.clearCache(OSIServiceCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the osi service current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OSIServiceCurrentStage osiServiceCurrentStage) {
		entityCache.removeResult(
			OSIServiceCurrentStageImpl.class, osiServiceCurrentStage);
	}

	@Override
	public void clearCache(
		List<OSIServiceCurrentStage> osiServiceCurrentStages) {

		for (OSIServiceCurrentStage osiServiceCurrentStage :
				osiServiceCurrentStages) {

			entityCache.removeResult(
				OSIServiceCurrentStageImpl.class, osiServiceCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OSIServiceCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OSIServiceCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OSIServiceCurrentStageModelImpl osiServiceCurrentStageModelImpl) {

		Object[] args = new Object[] {
			osiServiceCurrentStageModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIService_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById, args,
			osiServiceCurrentStageModelImpl);
	}

	/**
	 * Creates a new osi service current stage with the primary key. Does not add the osi service current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi service current stage
	 * @return the new osi service current stage
	 */
	@Override
	public OSIServiceCurrentStage create(long osiCurrentStageId) {
		OSIServiceCurrentStage osiServiceCurrentStage =
			new OSIServiceCurrentStageImpl();

		osiServiceCurrentStage.setNew(true);
		osiServiceCurrentStage.setPrimaryKey(osiCurrentStageId);

		osiServiceCurrentStage.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiServiceCurrentStage;
	}

	/**
	 * Removes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage remove(long osiCurrentStageId)
		throws NoSuchOSIServiceCurrentStageException {

		return remove((Serializable)osiCurrentStageId);
	}

	/**
	 * Removes the osi service current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi service current stage
	 * @return the osi service current stage that was removed
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage remove(Serializable primaryKey)
		throws NoSuchOSIServiceCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			OSIServiceCurrentStage osiServiceCurrentStage =
				(OSIServiceCurrentStage)session.get(
					OSIServiceCurrentStageImpl.class, primaryKey);

			if (osiServiceCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOSIServiceCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServiceCurrentStage);
		}
		catch (NoSuchOSIServiceCurrentStageException noSuchEntityException) {
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
	protected OSIServiceCurrentStage removeImpl(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServiceCurrentStage)) {
				osiServiceCurrentStage = (OSIServiceCurrentStage)session.get(
					OSIServiceCurrentStageImpl.class,
					osiServiceCurrentStage.getPrimaryKeyObj());
			}

			if (osiServiceCurrentStage != null) {
				session.delete(osiServiceCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServiceCurrentStage != null) {
			clearCache(osiServiceCurrentStage);
		}

		return osiServiceCurrentStage;
	}

	@Override
	public OSIServiceCurrentStage updateImpl(
		OSIServiceCurrentStage osiServiceCurrentStage) {

		boolean isNew = osiServiceCurrentStage.isNew();

		if (!(osiServiceCurrentStage instanceof
				OSIServiceCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServiceCurrentStage.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServiceCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServiceCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OSIServiceCurrentStage implementation " +
					osiServiceCurrentStage.getClass());
		}

		OSIServiceCurrentStageModelImpl osiServiceCurrentStageModelImpl =
			(OSIServiceCurrentStageModelImpl)osiServiceCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServiceCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServiceCurrentStage.setCreateDate(date);
			}
			else {
				osiServiceCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServiceCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServiceCurrentStage.setModifiedDate(date);
			}
			else {
				osiServiceCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServiceCurrentStage);
			}
			else {
				osiServiceCurrentStage = (OSIServiceCurrentStage)session.merge(
					osiServiceCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OSIServiceCurrentStageImpl.class, osiServiceCurrentStageModelImpl,
			false, true);

		cacheUniqueFindersCache(osiServiceCurrentStageModelImpl);

		if (isNew) {
			osiServiceCurrentStage.setNew(false);
		}

		osiServiceCurrentStage.resetOriginalValues();

		return osiServiceCurrentStage;
	}

	/**
	 * Returns the osi service current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOSIServiceCurrentStageException {

		OSIServiceCurrentStage osiServiceCurrentStage = fetchByPrimaryKey(
			primaryKey);

		if (osiServiceCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOSIServiceCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServiceCurrentStage;
	}

	/**
	 * Returns the osi service current stage with the primary key or throws a <code>NoSuchOSIServiceCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage
	 * @throws NoSuchOSIServiceCurrentStageException if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage findByPrimaryKey(long osiCurrentStageId)
		throws NoSuchOSIServiceCurrentStageException {

		return findByPrimaryKey((Serializable)osiCurrentStageId);
	}

	/**
	 * Returns the osi service current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi service current stage
	 * @return the osi service current stage, or <code>null</code> if a osi service current stage with the primary key could not be found
	 */
	@Override
	public OSIServiceCurrentStage fetchByPrimaryKey(long osiCurrentStageId) {
		return fetchByPrimaryKey((Serializable)osiCurrentStageId);
	}

	/**
	 * Returns all the osi service current stages.
	 *
	 * @return the osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @return the range of osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi service current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service current stages
	 * @param end the upper bound of the range of osi service current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service current stages
	 */
	@Override
	public List<OSIServiceCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OSIServiceCurrentStage> orderByComparator,
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

		List<OSIServiceCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<OSIServiceCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICECURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICECURRENTSTAGE;

				sql = sql.concat(OSIServiceCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OSIServiceCurrentStage>)QueryUtil.list(
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
	 * Removes all the osi service current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OSIServiceCurrentStage osiServiceCurrentStage : findAll()) {
			remove(osiServiceCurrentStage);
		}
	}

	/**
	 * Returns the number of osi service current stages.
	 *
	 * @return the number of osi service current stages
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
					_SQL_COUNT_OSISERVICECURRENTSTAGE);

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
		return "osiCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICECURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OSIServiceCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi service current stage persistence.
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

		_finderPathFetchBygetOSIService_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIService_ById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOSIService_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIService_ById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		_finderPathWithPaginationFindBygetOSI_CS_OSIAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOSI_CS_OSIAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_CS_OSIAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOSI_CS_OSIAI",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOSI_CS_OSIAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOSI_CS_OSIAI",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OSIServiceCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OSIServiceCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(OSIServiceCurrentStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICECURRENTSTAGE =
		"SELECT osiServiceCurrentStage FROM OSIServiceCurrentStage osiServiceCurrentStage";

	private static final String _SQL_SELECT_OSISERVICECURRENTSTAGE_WHERE =
		"SELECT osiServiceCurrentStage FROM OSIServiceCurrentStage osiServiceCurrentStage WHERE ";

	private static final String _SQL_COUNT_OSISERVICECURRENTSTAGE =
		"SELECT COUNT(osiServiceCurrentStage) FROM OSIServiceCurrentStage osiServiceCurrentStage";

	private static final String _SQL_COUNT_OSISERVICECURRENTSTAGE_WHERE =
		"SELECT COUNT(osiServiceCurrentStage) FROM OSIServiceCurrentStage osiServiceCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServiceCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OSIServiceCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OSIServiceCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OSIServiceCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}