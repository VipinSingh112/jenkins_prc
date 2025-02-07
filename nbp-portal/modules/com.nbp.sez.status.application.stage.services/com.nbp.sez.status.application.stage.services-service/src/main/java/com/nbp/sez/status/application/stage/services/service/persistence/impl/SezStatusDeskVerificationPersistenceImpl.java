/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusDeskVerificationException;
import com.nbp.sez.status.application.stage.services.model.SezStatusDeskVerification;
import com.nbp.sez.status.application.stage.services.model.SezStatusDeskVerificationTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusDeskVerificationModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusDeskVerificationPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusDeskVerificationUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusDeskVerificationPersistence.class)
public class SezStatusDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<SezStatusDeskVerification>
	implements SezStatusDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusDeskVerificationUtil</code> to access the sez status desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationSezById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationSezById;
	private FinderPath _finderPathCountBygetDeskVerificationSezById;

	/**
	 * Returns all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the matching sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findBygetDeskVerificationSezById(
		long sezApplicationId) {

		return findBygetDeskVerificationSezById(
			sezApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of matching sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findBygetDeskVerificationSezById(
		long sezApplicationId, int start, int end) {

		return findBygetDeskVerificationSezById(
			sezApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findBygetDeskVerificationSezById(
		long sezApplicationId, int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return findBygetDeskVerificationSezById(
			sezApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param sezApplicationId the sez application ID
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findBygetDeskVerificationSezById(
		long sezApplicationId, int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationSezById;
				finderArgs = new Object[] {sezApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationSezById;
			finderArgs = new Object[] {
				sezApplicationId, start, end, orderByComparator
			};
		}

		List<SezStatusDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<SezStatusDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusDeskVerification sezStatusDeskVerification :
						list) {

					if (sezApplicationId !=
							sezStatusDeskVerification.getSezApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZSTATUSDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONSEZBYID_SEZAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezApplicationId);

				list = (List<SezStatusDeskVerification>)QueryUtil.list(
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
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	@Override
	public SezStatusDeskVerification findBygetDeskVerificationSezById_First(
			long sezApplicationId,
			OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException {

		SezStatusDeskVerification sezStatusDeskVerification =
			fetchBygetDeskVerificationSezById_First(
				sezApplicationId, orderByComparator);

		if (sezStatusDeskVerification != null) {
			return sezStatusDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezApplicationId=");
		sb.append(sezApplicationId);

		sb.append("}");

		throw new NoSuchSezStatusDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	@Override
	public SezStatusDeskVerification fetchBygetDeskVerificationSezById_First(
		long sezApplicationId,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		List<SezStatusDeskVerification> list = findBygetDeskVerificationSezById(
			sezApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a matching sez status desk verification could not be found
	 */
	@Override
	public SezStatusDeskVerification findBygetDeskVerificationSezById_Last(
			long sezApplicationId,
			OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException {

		SezStatusDeskVerification sezStatusDeskVerification =
			fetchBygetDeskVerificationSezById_Last(
				sezApplicationId, orderByComparator);

		if (sezStatusDeskVerification != null) {
			return sezStatusDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezApplicationId=");
		sb.append(sezApplicationId);

		sb.append("}");

		throw new NoSuchSezStatusDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status desk verification, or <code>null</code> if a matching sez status desk verification could not be found
	 */
	@Override
	public SezStatusDeskVerification fetchBygetDeskVerificationSezById_Last(
		long sezApplicationId,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationSezById(sezApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezStatusDeskVerification> list = findBygetDeskVerificationSezById(
			sezApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status desk verifications before and after the current sez status desk verification in the ordered set where sezApplicationId = &#63;.
	 *
	 * @param SezDeskVerificationId the primary key of the current sez status desk verification
	 * @param sezApplicationId the sez application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification[]
			findBygetDeskVerificationSezById_PrevAndNext(
				long SezDeskVerificationId, long sezApplicationId,
				OrderByComparator<SezStatusDeskVerification> orderByComparator)
		throws NoSuchSezStatusDeskVerificationException {

		SezStatusDeskVerification sezStatusDeskVerification = findByPrimaryKey(
			SezDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusDeskVerification[] array =
				new SezStatusDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationSezById_PrevAndNext(
				session, sezStatusDeskVerification, sezApplicationId,
				orderByComparator, true);

			array[1] = sezStatusDeskVerification;

			array[2] = getBygetDeskVerificationSezById_PrevAndNext(
				session, sezStatusDeskVerification, sezApplicationId,
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

	protected SezStatusDeskVerification
		getBygetDeskVerificationSezById_PrevAndNext(
			Session session,
			SezStatusDeskVerification sezStatusDeskVerification,
			long sezApplicationId,
			OrderByComparator<SezStatusDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSDESKVERIFICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETDESKVERIFICATIONSEZBYID_SEZAPPLICATIONID_2);

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
			sb.append(SezStatusDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status desk verifications where sezApplicationId = &#63; from the database.
	 *
	 * @param sezApplicationId the sez application ID
	 */
	@Override
	public void removeBygetDeskVerificationSezById(long sezApplicationId) {
		for (SezStatusDeskVerification sezStatusDeskVerification :
				findBygetDeskVerificationSezById(
					sezApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusDeskVerification);
		}
	}

	/**
	 * Returns the number of sez status desk verifications where sezApplicationId = &#63;.
	 *
	 * @param sezApplicationId the sez application ID
	 * @return the number of matching sez status desk verifications
	 */
	@Override
	public int countBygetDeskVerificationSezById(long sezApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerificationSezById;

		Object[] finderArgs = new Object[] {sezApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONSEZBYID_SEZAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezApplicationId);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONSEZBYID_SEZAPPLICATIONID_2 =
			"sezStatusDeskVerification.sezApplicationId = ?";

	public SezStatusDeskVerificationPersistenceImpl() {
		setModelClass(SezStatusDeskVerification.class);

		setModelImplClass(SezStatusDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the sez status desk verification in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerification the sez status desk verification
	 */
	@Override
	public void cacheResult(
		SezStatusDeskVerification sezStatusDeskVerification) {

		entityCache.putResult(
			SezStatusDeskVerificationImpl.class,
			sezStatusDeskVerification.getPrimaryKey(),
			sezStatusDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status desk verifications in the entity cache if it is enabled.
	 *
	 * @param sezStatusDeskVerifications the sez status desk verifications
	 */
	@Override
	public void cacheResult(
		List<SezStatusDeskVerification> sezStatusDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusDeskVerification sezStatusDeskVerification :
				sezStatusDeskVerifications) {

			if (entityCache.getResult(
					SezStatusDeskVerificationImpl.class,
					sezStatusDeskVerification.getPrimaryKey()) == null) {

				cacheResult(sezStatusDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all sez status desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusDeskVerificationImpl.class);

		finderCache.clearCache(SezStatusDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the sez status desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusDeskVerification sezStatusDeskVerification) {

		entityCache.removeResult(
			SezStatusDeskVerificationImpl.class, sezStatusDeskVerification);
	}

	@Override
	public void clearCache(
		List<SezStatusDeskVerification> sezStatusDeskVerifications) {

		for (SezStatusDeskVerification sezStatusDeskVerification :
				sezStatusDeskVerifications) {

			entityCache.removeResult(
				SezStatusDeskVerificationImpl.class, sezStatusDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez status desk verification with the primary key. Does not add the sez status desk verification to the database.
	 *
	 * @param SezDeskVerificationId the primary key for the new sez status desk verification
	 * @return the new sez status desk verification
	 */
	@Override
	public SezStatusDeskVerification create(long SezDeskVerificationId) {
		SezStatusDeskVerification sezStatusDeskVerification =
			new SezStatusDeskVerificationImpl();

		sezStatusDeskVerification.setNew(true);
		sezStatusDeskVerification.setPrimaryKey(SezDeskVerificationId);

		sezStatusDeskVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusDeskVerification;
	}

	/**
	 * Removes the sez status desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification that was removed
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification remove(long SezDeskVerificationId)
		throws NoSuchSezStatusDeskVerificationException {

		return remove((Serializable)SezDeskVerificationId);
	}

	/**
	 * Removes the sez status desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status desk verification
	 * @return the sez status desk verification that was removed
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification remove(Serializable primaryKey)
		throws NoSuchSezStatusDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			SezStatusDeskVerification sezStatusDeskVerification =
				(SezStatusDeskVerification)session.get(
					SezStatusDeskVerificationImpl.class, primaryKey);

			if (sezStatusDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusDeskVerification);
		}
		catch (NoSuchSezStatusDeskVerificationException noSuchEntityException) {
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
	protected SezStatusDeskVerification removeImpl(
		SezStatusDeskVerification sezStatusDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusDeskVerification)) {
				sezStatusDeskVerification =
					(SezStatusDeskVerification)session.get(
						SezStatusDeskVerificationImpl.class,
						sezStatusDeskVerification.getPrimaryKeyObj());
			}

			if (sezStatusDeskVerification != null) {
				session.delete(sezStatusDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusDeskVerification != null) {
			clearCache(sezStatusDeskVerification);
		}

		return sezStatusDeskVerification;
	}

	@Override
	public SezStatusDeskVerification updateImpl(
		SezStatusDeskVerification sezStatusDeskVerification) {

		boolean isNew = sezStatusDeskVerification.isNew();

		if (!(sezStatusDeskVerification instanceof
				SezStatusDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusDeskVerification implementation " +
					sezStatusDeskVerification.getClass());
		}

		SezStatusDeskVerificationModelImpl sezStatusDeskVerificationModelImpl =
			(SezStatusDeskVerificationModelImpl)sezStatusDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusDeskVerification.setCreateDate(date);
			}
			else {
				sezStatusDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusDeskVerification.setModifiedDate(date);
			}
			else {
				sezStatusDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusDeskVerification);
			}
			else {
				sezStatusDeskVerification =
					(SezStatusDeskVerification)session.merge(
						sezStatusDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusDeskVerificationImpl.class,
			sezStatusDeskVerificationModelImpl, false, true);

		if (isNew) {
			sezStatusDeskVerification.setNew(false);
		}

		sezStatusDeskVerification.resetOriginalValues();

		return sezStatusDeskVerification;
	}

	/**
	 * Returns the sez status desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status desk verification
	 * @return the sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusDeskVerificationException {

		SezStatusDeskVerification sezStatusDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusDeskVerification;
	}

	/**
	 * Returns the sez status desk verification with the primary key or throws a <code>NoSuchSezStatusDeskVerificationException</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification
	 * @throws NoSuchSezStatusDeskVerificationException if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification findByPrimaryKey(
			long SezDeskVerificationId)
		throws NoSuchSezStatusDeskVerificationException {

		return findByPrimaryKey((Serializable)SezDeskVerificationId);
	}

	/**
	 * Returns the sez status desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezDeskVerificationId the primary key of the sez status desk verification
	 * @return the sez status desk verification, or <code>null</code> if a sez status desk verification with the primary key could not be found
	 */
	@Override
	public SezStatusDeskVerification fetchByPrimaryKey(
		long SezDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)SezDeskVerificationId);
	}

	/**
	 * Returns all the sez status desk verifications.
	 *
	 * @return the sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @return the range of sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findAll(
		int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status desk verifications
	 * @param end the upper bound of the range of sez status desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status desk verifications
	 */
	@Override
	public List<SezStatusDeskVerification> findAll(
		int start, int end,
		OrderByComparator<SezStatusDeskVerification> orderByComparator,
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

		List<SezStatusDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<SezStatusDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSDESKVERIFICATION;

				sql = sql.concat(
					SezStatusDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusDeskVerification>)QueryUtil.list(
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
	 * Removes all the sez status desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusDeskVerification sezStatusDeskVerification : findAll()) {
			remove(sezStatusDeskVerification);
		}
	}

	/**
	 * Returns the number of sez status desk verifications.
	 *
	 * @return the number of sez status desk verifications
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
					_SQL_COUNT_SEZSTATUSDESKVERIFICATION);

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
		return "SezDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationSezById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationSezById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"sezApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationSezById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationSezById",
				new String[] {Long.class.getName()},
				new String[] {"sezApplicationId"}, true);

		_finderPathCountBygetDeskVerificationSezById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationSezById",
			new String[] {Long.class.getName()},
			new String[] {"sezApplicationId"}, false);

		SezStatusDeskVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusDeskVerificationUtil.setPersistence(null);

		entityCache.removeCache(SezStatusDeskVerificationImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSDESKVERIFICATION =
		"SELECT sezStatusDeskVerification FROM SezStatusDeskVerification sezStatusDeskVerification";

	private static final String _SQL_SELECT_SEZSTATUSDESKVERIFICATION_WHERE =
		"SELECT sezStatusDeskVerification FROM SezStatusDeskVerification sezStatusDeskVerification WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSDESKVERIFICATION =
		"SELECT COUNT(sezStatusDeskVerification) FROM SezStatusDeskVerification sezStatusDeskVerification";

	private static final String _SQL_COUNT_SEZSTATUSDESKVERIFICATION_WHERE =
		"SELECT COUNT(sezStatusDeskVerification) FROM SezStatusDeskVerification sezStatusDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}