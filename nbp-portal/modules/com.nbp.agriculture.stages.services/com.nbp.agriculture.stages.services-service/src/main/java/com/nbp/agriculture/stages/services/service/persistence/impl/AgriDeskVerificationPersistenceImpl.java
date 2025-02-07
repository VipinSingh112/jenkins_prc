/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence.impl;

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

import com.nbp.agriculture.stages.services.exception.NoSuchAgriDeskVerificationException;
import com.nbp.agriculture.stages.services.model.AgriDeskVerification;
import com.nbp.agriculture.stages.services.model.AgriDeskVerificationTable;
import com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationImpl;
import com.nbp.agriculture.stages.services.model.impl.AgriDeskVerificationModelImpl;
import com.nbp.agriculture.stages.services.service.persistence.AgriDeskVerificationPersistence;
import com.nbp.agriculture.stages.services.service.persistence.AgriDeskVerificationUtil;
import com.nbp.agriculture.stages.services.service.persistence.impl.constants.NBP_AGRIPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the agri desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgriDeskVerificationPersistence.class)
public class AgriDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<AgriDeskVerification>
	implements AgriDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgriDeskVerificationUtil</code> to access the agri desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgriDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationAgri_ById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationAgri_ById;
	private FinderPath _finderPathCountBygetDeskVerificationAgri_ById;

	/**
	 * Returns all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		return findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of matching agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end) {

		return findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findBygetDeskVerificationAgri_ById(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationAgri_ById;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationAgri_ById;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgriDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<AgriDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgriDeskVerification agriDeskVerification : list) {
					if (agricultureApplicationId !=
							agriDeskVerification.
								getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRIDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONAGRI_BYID_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgriDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgriDeskVerification>)QueryUtil.list(
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
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	@Override
	public AgriDeskVerification findBygetDeskVerificationAgri_ById_First(
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException {

		AgriDeskVerification agriDeskVerification =
			fetchBygetDeskVerificationAgri_ById_First(
				agricultureApplicationId, orderByComparator);

		if (agriDeskVerification != null) {
			return agriDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	@Override
	public AgriDeskVerification fetchBygetDeskVerificationAgri_ById_First(
		long agricultureApplicationId,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		List<AgriDeskVerification> list = findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a matching agri desk verification could not be found
	 */
	@Override
	public AgriDeskVerification findBygetDeskVerificationAgri_ById_Last(
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException {

		AgriDeskVerification agriDeskVerification =
			fetchBygetDeskVerificationAgri_ById_Last(
				agricultureApplicationId, orderByComparator);

		if (agriDeskVerification != null) {
			return agriDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agri desk verification, or <code>null</code> if a matching agri desk verification could not be found
	 */
	@Override
	public AgriDeskVerification fetchBygetDeskVerificationAgri_ById_Last(
		long agricultureApplicationId,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationAgri_ById(
			agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgriDeskVerification> list = findBygetDeskVerificationAgri_ById(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agri desk verifications before and after the current agri desk verification in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriDeskVerificationId the primary key of the current agri desk verification
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification[]
			findBygetDeskVerificationAgri_ById_PrevAndNext(
				long agriDeskVerificationId, long agricultureApplicationId,
				OrderByComparator<AgriDeskVerification> orderByComparator)
		throws NoSuchAgriDeskVerificationException {

		AgriDeskVerification agriDeskVerification = findByPrimaryKey(
			agriDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			AgriDeskVerification[] array = new AgriDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationAgri_ById_PrevAndNext(
				session, agriDeskVerification, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agriDeskVerification;

			array[2] = getBygetDeskVerificationAgri_ById_PrevAndNext(
				session, agriDeskVerification, agricultureApplicationId,
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

	protected AgriDeskVerification
		getBygetDeskVerificationAgri_ById_PrevAndNext(
			Session session, AgriDeskVerification agriDeskVerification,
			long agricultureApplicationId,
			OrderByComparator<AgriDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRIDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONAGRI_BYID_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgriDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(agricultureApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agriDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgriDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agri desk verifications where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		for (AgriDeskVerification agriDeskVerification :
				findBygetDeskVerificationAgri_ById(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agriDeskVerification);
		}
	}

	/**
	 * Returns the number of agri desk verifications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri desk verifications
	 */
	@Override
	public int countBygetDeskVerificationAgri_ById(
		long agricultureApplicationId) {

		FinderPath finderPath = _finderPathCountBygetDeskVerificationAgri_ById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRIDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONAGRI_BYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONAGRI_BYID_AGRICULTUREAPPLICATIONID_2 =
			"agriDeskVerification.agricultureApplicationId = ?";

	public AgriDeskVerificationPersistenceImpl() {
		setModelClass(AgriDeskVerification.class);

		setModelImplClass(AgriDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(AgriDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the agri desk verification in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerification the agri desk verification
	 */
	@Override
	public void cacheResult(AgriDeskVerification agriDeskVerification) {
		entityCache.putResult(
			AgriDeskVerificationImpl.class,
			agriDeskVerification.getPrimaryKey(), agriDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agri desk verifications in the entity cache if it is enabled.
	 *
	 * @param agriDeskVerifications the agri desk verifications
	 */
	@Override
	public void cacheResult(List<AgriDeskVerification> agriDeskVerifications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agriDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgriDeskVerification agriDeskVerification :
				agriDeskVerifications) {

			if (entityCache.getResult(
					AgriDeskVerificationImpl.class,
					agriDeskVerification.getPrimaryKey()) == null) {

				cacheResult(agriDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all agri desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgriDeskVerificationImpl.class);

		finderCache.clearCache(AgriDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the agri desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgriDeskVerification agriDeskVerification) {
		entityCache.removeResult(
			AgriDeskVerificationImpl.class, agriDeskVerification);
	}

	@Override
	public void clearCache(List<AgriDeskVerification> agriDeskVerifications) {
		for (AgriDeskVerification agriDeskVerification :
				agriDeskVerifications) {

			entityCache.removeResult(
				AgriDeskVerificationImpl.class, agriDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgriDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgriDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new agri desk verification with the primary key. Does not add the agri desk verification to the database.
	 *
	 * @param agriDeskVerificationId the primary key for the new agri desk verification
	 * @return the new agri desk verification
	 */
	@Override
	public AgriDeskVerification create(long agriDeskVerificationId) {
		AgriDeskVerification agriDeskVerification =
			new AgriDeskVerificationImpl();

		agriDeskVerification.setNew(true);
		agriDeskVerification.setPrimaryKey(agriDeskVerificationId);

		agriDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agriDeskVerification;
	}

	/**
	 * Removes the agri desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification that was removed
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification remove(long agriDeskVerificationId)
		throws NoSuchAgriDeskVerificationException {

		return remove((Serializable)agriDeskVerificationId);
	}

	/**
	 * Removes the agri desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agri desk verification
	 * @return the agri desk verification that was removed
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification remove(Serializable primaryKey)
		throws NoSuchAgriDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			AgriDeskVerification agriDeskVerification =
				(AgriDeskVerification)session.get(
					AgriDeskVerificationImpl.class, primaryKey);

			if (agriDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgriDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agriDeskVerification);
		}
		catch (NoSuchAgriDeskVerificationException noSuchEntityException) {
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
	protected AgriDeskVerification removeImpl(
		AgriDeskVerification agriDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agriDeskVerification)) {
				agriDeskVerification = (AgriDeskVerification)session.get(
					AgriDeskVerificationImpl.class,
					agriDeskVerification.getPrimaryKeyObj());
			}

			if (agriDeskVerification != null) {
				session.delete(agriDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agriDeskVerification != null) {
			clearCache(agriDeskVerification);
		}

		return agriDeskVerification;
	}

	@Override
	public AgriDeskVerification updateImpl(
		AgriDeskVerification agriDeskVerification) {

		boolean isNew = agriDeskVerification.isNew();

		if (!(agriDeskVerification instanceof AgriDeskVerificationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agriDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agriDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agriDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgriDeskVerification implementation " +
					agriDeskVerification.getClass());
		}

		AgriDeskVerificationModelImpl agriDeskVerificationModelImpl =
			(AgriDeskVerificationModelImpl)agriDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agriDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				agriDeskVerification.setCreateDate(date);
			}
			else {
				agriDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agriDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agriDeskVerification.setModifiedDate(date);
			}
			else {
				agriDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agriDeskVerification);
			}
			else {
				agriDeskVerification = (AgriDeskVerification)session.merge(
					agriDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgriDeskVerificationImpl.class, agriDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			agriDeskVerification.setNew(false);
		}

		agriDeskVerification.resetOriginalValues();

		return agriDeskVerification;
	}

	/**
	 * Returns the agri desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agri desk verification
	 * @return the agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgriDeskVerificationException {

		AgriDeskVerification agriDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (agriDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgriDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agriDeskVerification;
	}

	/**
	 * Returns the agri desk verification with the primary key or throws a <code>NoSuchAgriDeskVerificationException</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification
	 * @throws NoSuchAgriDeskVerificationException if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification findByPrimaryKey(long agriDeskVerificationId)
		throws NoSuchAgriDeskVerificationException {

		return findByPrimaryKey((Serializable)agriDeskVerificationId);
	}

	/**
	 * Returns the agri desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriDeskVerificationId the primary key of the agri desk verification
	 * @return the agri desk verification, or <code>null</code> if a agri desk verification with the primary key could not be found
	 */
	@Override
	public AgriDeskVerification fetchByPrimaryKey(long agriDeskVerificationId) {
		return fetchByPrimaryKey((Serializable)agriDeskVerificationId);
	}

	/**
	 * Returns all the agri desk verifications.
	 *
	 * @return the agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @return the range of agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agri desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri desk verifications
	 * @param end the upper bound of the range of agri desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri desk verifications
	 */
	@Override
	public List<AgriDeskVerification> findAll(
		int start, int end,
		OrderByComparator<AgriDeskVerification> orderByComparator,
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

		List<AgriDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<AgriDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRIDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRIDESKVERIFICATION;

				sql = sql.concat(AgriDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgriDeskVerification>)QueryUtil.list(
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
	 * Removes all the agri desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgriDeskVerification agriDeskVerification : findAll()) {
			remove(agriDeskVerification);
		}
	}

	/**
	 * Returns the number of agri desk verifications.
	 *
	 * @return the number of agri desk verifications
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
					_SQL_COUNT_AGRIDESKVERIFICATION);

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
		return "agriDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRIDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgriDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agri desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationAgri_ById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationAgri_ById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationAgri_ById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationAgri_ById",
				new String[] {Long.class.getName()},
				new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetDeskVerificationAgri_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationAgri_ById",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgriDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgriDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(AgriDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRIDESKVERIFICATION =
		"SELECT agriDeskVerification FROM AgriDeskVerification agriDeskVerification";

	private static final String _SQL_SELECT_AGRIDESKVERIFICATION_WHERE =
		"SELECT agriDeskVerification FROM AgriDeskVerification agriDeskVerification WHERE ";

	private static final String _SQL_COUNT_AGRIDESKVERIFICATION =
		"SELECT COUNT(agriDeskVerification) FROM AgriDeskVerification agriDeskVerification";

	private static final String _SQL_COUNT_AGRIDESKVERIFICATION_WHERE =
		"SELECT COUNT(agriDeskVerification) FROM AgriDeskVerification agriDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agriDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgriDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgriDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgriDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}