/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence.impl;

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

import com.nbp.healthcare.stage.service.exception.NoSuchHealthDeskVerificationException;
import com.nbp.healthcare.stage.service.model.HealthDeskVerification;
import com.nbp.healthcare.stage.service.model.HealthDeskVerificationTable;
import com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationImpl;
import com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl;
import com.nbp.healthcare.stage.service.service.persistence.HealthDeskVerificationPersistence;
import com.nbp.healthcare.stage.service.service.persistence.HealthDeskVerificationUtil;
import com.nbp.healthcare.stage.service.service.persistence.impl.constants.HEALTH_STAGESPersistenceConstants;

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
 * The persistence implementation for the health desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthDeskVerificationPersistence.class)
public class HealthDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<HealthDeskVerification>
	implements HealthDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthDeskVerificationUtil</code> to access the health desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationHealthById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationHealthById;
	private FinderPath _finderPathCountBygetDeskVerificationHealthById;

	/**
	 * Returns all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findBygetDeskVerificationHealthById(
		long healthCareApplicationId) {

		return findBygetDeskVerificationHealthById(
			healthCareApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of matching health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findBygetDeskVerificationHealthById(
		long healthCareApplicationId, int start, int end) {

		return findBygetDeskVerificationHealthById(
			healthCareApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findBygetDeskVerificationHealthById(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		return findBygetDeskVerificationHealthById(
			healthCareApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findBygetDeskVerificationHealthById(
		long healthCareApplicationId, int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationHealthById;
				finderArgs = new Object[] {healthCareApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationHealthById;
			finderArgs = new Object[] {
				healthCareApplicationId, start, end, orderByComparator
			};
		}

		List<HealthDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<HealthDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthDeskVerification healthDeskVerification : list) {
					if (healthCareApplicationId !=
							healthDeskVerification.
								getHealthCareApplicationId()) {

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

			sb.append(_SQL_SELECT_HEALTHDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONHEALTHBYID_HEALTHCAREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				list = (List<HealthDeskVerification>)QueryUtil.list(
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
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	@Override
	public HealthDeskVerification findBygetDeskVerificationHealthById_First(
			long healthCareApplicationId,
			OrderByComparator<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException {

		HealthDeskVerification healthDeskVerification =
			fetchBygetDeskVerificationHealthById_First(
				healthCareApplicationId, orderByComparator);

		if (healthDeskVerification != null) {
			return healthDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("healthCareApplicationId=");
		sb.append(healthCareApplicationId);

		sb.append("}");

		throw new NoSuchHealthDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	@Override
	public HealthDeskVerification fetchBygetDeskVerificationHealthById_First(
		long healthCareApplicationId,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		List<HealthDeskVerification> list = findBygetDeskVerificationHealthById(
			healthCareApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a matching health desk verification could not be found
	 */
	@Override
	public HealthDeskVerification findBygetDeskVerificationHealthById_Last(
			long healthCareApplicationId,
			OrderByComparator<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException {

		HealthDeskVerification healthDeskVerification =
			fetchBygetDeskVerificationHealthById_Last(
				healthCareApplicationId, orderByComparator);

		if (healthDeskVerification != null) {
			return healthDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("healthCareApplicationId=");
		sb.append(healthCareApplicationId);

		sb.append("}");

		throw new NoSuchHealthDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health desk verification, or <code>null</code> if a matching health desk verification could not be found
	 */
	@Override
	public HealthDeskVerification fetchBygetDeskVerificationHealthById_Last(
		long healthCareApplicationId,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationHealthById(
			healthCareApplicationId);

		if (count == 0) {
			return null;
		}

		List<HealthDeskVerification> list = findBygetDeskVerificationHealthById(
			healthCareApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health desk verifications before and after the current health desk verification in the ordered set where healthCareApplicationId = &#63;.
	 *
	 * @param healthDeskVerificationId the primary key of the current health desk verification
	 * @param healthCareApplicationId the health care application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification[]
			findBygetDeskVerificationHealthById_PrevAndNext(
				long healthDeskVerificationId, long healthCareApplicationId,
				OrderByComparator<HealthDeskVerification> orderByComparator)
		throws NoSuchHealthDeskVerificationException {

		HealthDeskVerification healthDeskVerification = findByPrimaryKey(
			healthDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			HealthDeskVerification[] array = new HealthDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationHealthById_PrevAndNext(
				session, healthDeskVerification, healthCareApplicationId,
				orderByComparator, true);

			array[1] = healthDeskVerification;

			array[2] = getBygetDeskVerificationHealthById_PrevAndNext(
				session, healthDeskVerification, healthCareApplicationId,
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

	protected HealthDeskVerification
		getBygetDeskVerificationHealthById_PrevAndNext(
			Session session, HealthDeskVerification healthDeskVerification,
			long healthCareApplicationId,
			OrderByComparator<HealthDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONHEALTHBYID_HEALTHCAREAPPLICATIONID_2);

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
			sb.append(HealthDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(healthCareApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						healthDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health desk verifications where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 */
	@Override
	public void removeBygetDeskVerificationHealthById(
		long healthCareApplicationId) {

		for (HealthDeskVerification healthDeskVerification :
				findBygetDeskVerificationHealthById(
					healthCareApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(healthDeskVerification);
		}
	}

	/**
	 * Returns the number of health desk verifications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health desk verifications
	 */
	@Override
	public int countBygetDeskVerificationHealthById(
		long healthCareApplicationId) {

		FinderPath finderPath = _finderPathCountBygetDeskVerificationHealthById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONHEALTHBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONHEALTHBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthDeskVerification.healthCareApplicationId = ?";

	public HealthDeskVerificationPersistenceImpl() {
		setModelClass(HealthDeskVerification.class);

		setModelImplClass(HealthDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(HealthDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the health desk verification in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerification the health desk verification
	 */
	@Override
	public void cacheResult(HealthDeskVerification healthDeskVerification) {
		entityCache.putResult(
			HealthDeskVerificationImpl.class,
			healthDeskVerification.getPrimaryKey(), healthDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health desk verifications in the entity cache if it is enabled.
	 *
	 * @param healthDeskVerifications the health desk verifications
	 */
	@Override
	public void cacheResult(
		List<HealthDeskVerification> healthDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthDeskVerification healthDeskVerification :
				healthDeskVerifications) {

			if (entityCache.getResult(
					HealthDeskVerificationImpl.class,
					healthDeskVerification.getPrimaryKey()) == null) {

				cacheResult(healthDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all health desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthDeskVerificationImpl.class);

		finderCache.clearCache(HealthDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the health desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthDeskVerification healthDeskVerification) {
		entityCache.removeResult(
			HealthDeskVerificationImpl.class, healthDeskVerification);
	}

	@Override
	public void clearCache(
		List<HealthDeskVerification> healthDeskVerifications) {

		for (HealthDeskVerification healthDeskVerification :
				healthDeskVerifications) {

			entityCache.removeResult(
				HealthDeskVerificationImpl.class, healthDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new health desk verification with the primary key. Does not add the health desk verification to the database.
	 *
	 * @param healthDeskVerificationId the primary key for the new health desk verification
	 * @return the new health desk verification
	 */
	@Override
	public HealthDeskVerification create(long healthDeskVerificationId) {
		HealthDeskVerification healthDeskVerification =
			new HealthDeskVerificationImpl();

		healthDeskVerification.setNew(true);
		healthDeskVerification.setPrimaryKey(healthDeskVerificationId);

		healthDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthDeskVerification;
	}

	/**
	 * Removes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification remove(long healthDeskVerificationId)
		throws NoSuchHealthDeskVerificationException {

		return remove((Serializable)healthDeskVerificationId);
	}

	/**
	 * Removes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification remove(Serializable primaryKey)
		throws NoSuchHealthDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			HealthDeskVerification healthDeskVerification =
				(HealthDeskVerification)session.get(
					HealthDeskVerificationImpl.class, primaryKey);

			if (healthDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthDeskVerification);
		}
		catch (NoSuchHealthDeskVerificationException noSuchEntityException) {
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
	protected HealthDeskVerification removeImpl(
		HealthDeskVerification healthDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthDeskVerification)) {
				healthDeskVerification = (HealthDeskVerification)session.get(
					HealthDeskVerificationImpl.class,
					healthDeskVerification.getPrimaryKeyObj());
			}

			if (healthDeskVerification != null) {
				session.delete(healthDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthDeskVerification != null) {
			clearCache(healthDeskVerification);
		}

		return healthDeskVerification;
	}

	@Override
	public HealthDeskVerification updateImpl(
		HealthDeskVerification healthDeskVerification) {

		boolean isNew = healthDeskVerification.isNew();

		if (!(healthDeskVerification instanceof
				HealthDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthDeskVerification implementation " +
					healthDeskVerification.getClass());
		}

		HealthDeskVerificationModelImpl healthDeskVerificationModelImpl =
			(HealthDeskVerificationModelImpl)healthDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthDeskVerification.setCreateDate(date);
			}
			else {
				healthDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthDeskVerification.setModifiedDate(date);
			}
			else {
				healthDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthDeskVerification);
			}
			else {
				healthDeskVerification = (HealthDeskVerification)session.merge(
					healthDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthDeskVerificationImpl.class, healthDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			healthDeskVerification.setNew(false);
		}

		healthDeskVerification.resetOriginalValues();

		return healthDeskVerification;
	}

	/**
	 * Returns the health desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthDeskVerificationException {

		HealthDeskVerification healthDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (healthDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthDeskVerification;
	}

	/**
	 * Returns the health desk verification with the primary key or throws a <code>NoSuchHealthDeskVerificationException</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws NoSuchHealthDeskVerificationException if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification findByPrimaryKey(
			long healthDeskVerificationId)
		throws NoSuchHealthDeskVerificationException {

		return findByPrimaryKey((Serializable)healthDeskVerificationId);
	}

	/**
	 * Returns the health desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification, or <code>null</code> if a health desk verification with the primary key could not be found
	 */
	@Override
	public HealthDeskVerification fetchByPrimaryKey(
		long healthDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)healthDeskVerificationId);
	}

	/**
	 * Returns all the health desk verifications.
	 *
	 * @return the health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findAll(
		int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health desk verifications
	 */
	@Override
	public List<HealthDeskVerification> findAll(
		int start, int end,
		OrderByComparator<HealthDeskVerification> orderByComparator,
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

		List<HealthDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<HealthDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHDESKVERIFICATION;

				sql = sql.concat(HealthDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthDeskVerification>)QueryUtil.list(
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
	 * Removes all the health desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthDeskVerification healthDeskVerification : findAll()) {
			remove(healthDeskVerification);
		}
	}

	/**
	 * Returns the number of health desk verifications.
	 *
	 * @return the number of health desk verifications
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
					_SQL_COUNT_HEALTHDESKVERIFICATION);

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
		return "healthDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationHealthById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationHealthById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"healthCareApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationHealthById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationHealthById",
				new String[] {Long.class.getName()},
				new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetDeskVerificationHealthById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationHealthById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(HealthDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHDESKVERIFICATION =
		"SELECT healthDeskVerification FROM HealthDeskVerification healthDeskVerification";

	private static final String _SQL_SELECT_HEALTHDESKVERIFICATION_WHERE =
		"SELECT healthDeskVerification FROM HealthDeskVerification healthDeskVerification WHERE ";

	private static final String _SQL_COUNT_HEALTHDESKVERIFICATION =
		"SELECT COUNT(healthDeskVerification) FROM HealthDeskVerification healthDeskVerification";

	private static final String _SQL_COUNT_HEALTHDESKVERIFICATION_WHERE =
		"SELECT COUNT(healthDeskVerification) FROM HealthDeskVerification healthDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}