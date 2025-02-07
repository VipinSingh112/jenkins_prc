/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchNotUsedSecurityException;
import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurity;
import com.nbp.osi.insolvency.application.form.services.model.NotUsedSecurityTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.NotUsedSecurityModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.NotUsedSecurityPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.NotUsedSecurityUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

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
 * The persistence implementation for the not used security service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NotUsedSecurityPersistence.class)
public class NotUsedSecurityPersistenceImpl
	extends BasePersistenceImpl<NotUsedSecurity>
	implements NotUsedSecurityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NotUsedSecurityUtil</code> to access the not used security persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NotUsedSecurityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching not used securities
	 */
	@Override
	public List<NotUsedSecurity> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of matching not used securities
	 */
	@Override
	public List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching not used securities
	 */
	@Override
	public List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the not used securities where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching not used securities
	 */
	@Override
	public List<NotUsedSecurity> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<NotUsedSecurity> list = null;

		if (useFinderCache) {
			list = (List<NotUsedSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NotUsedSecurity notUsedSecurity : list) {
					if (osiInsolvencyId !=
							notUsedSecurity.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_NOTUSEDSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NotUsedSecurityModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<NotUsedSecurity>)QueryUtil.list(
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
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	@Override
	public NotUsedSecurity findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws NoSuchNotUsedSecurityException {

		NotUsedSecurity notUsedSecurity = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (notUsedSecurity != null) {
			return notUsedSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchNotUsedSecurityException(sb.toString());
	}

	/**
	 * Returns the first not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	@Override
	public NotUsedSecurity fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		List<NotUsedSecurity> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security
	 * @throws NoSuchNotUsedSecurityException if a matching not used security could not be found
	 */
	@Override
	public NotUsedSecurity findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws NoSuchNotUsedSecurityException {

		NotUsedSecurity notUsedSecurity = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (notUsedSecurity != null) {
			return notUsedSecurity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchNotUsedSecurityException(sb.toString());
	}

	/**
	 * Returns the last not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching not used security, or <code>null</code> if a matching not used security could not be found
	 */
	@Override
	public NotUsedSecurity fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<NotUsedSecurity> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the not used securities before and after the current not used security in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param notUsedSecurityId the primary key of the current not used security
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity[] findBygetOsiById_PrevAndNext(
			long notUsedSecurityId, long osiInsolvencyId,
			OrderByComparator<NotUsedSecurity> orderByComparator)
		throws NoSuchNotUsedSecurityException {

		NotUsedSecurity notUsedSecurity = findByPrimaryKey(notUsedSecurityId);

		Session session = null;

		try {
			session = openSession();

			NotUsedSecurity[] array = new NotUsedSecurityImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, notUsedSecurity, osiInsolvencyId, orderByComparator,
				true);

			array[1] = notUsedSecurity;

			array[2] = getBygetOsiById_PrevAndNext(
				session, notUsedSecurity, osiInsolvencyId, orderByComparator,
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

	protected NotUsedSecurity getBygetOsiById_PrevAndNext(
		Session session, NotUsedSecurity notUsedSecurity, long osiInsolvencyId,
		OrderByComparator<NotUsedSecurity> orderByComparator,
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

		sb.append(_SQL_SELECT_NOTUSEDSECURITY_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(NotUsedSecurityModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						notUsedSecurity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NotUsedSecurity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the not used securities where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (NotUsedSecurity notUsedSecurity :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(notUsedSecurity);
		}
	}

	/**
	 * Returns the number of not used securities where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching not used securities
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NOTUSEDSECURITY_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"notUsedSecurity.osiInsolvencyId = ?";

	public NotUsedSecurityPersistenceImpl() {
		setModelClass(NotUsedSecurity.class);

		setModelImplClass(NotUsedSecurityImpl.class);
		setModelPKClass(long.class);

		setTable(NotUsedSecurityTable.INSTANCE);
	}

	/**
	 * Caches the not used security in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurity the not used security
	 */
	@Override
	public void cacheResult(NotUsedSecurity notUsedSecurity) {
		entityCache.putResult(
			NotUsedSecurityImpl.class, notUsedSecurity.getPrimaryKey(),
			notUsedSecurity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the not used securities in the entity cache if it is enabled.
	 *
	 * @param notUsedSecurities the not used securities
	 */
	@Override
	public void cacheResult(List<NotUsedSecurity> notUsedSecurities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (notUsedSecurities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NotUsedSecurity notUsedSecurity : notUsedSecurities) {
			if (entityCache.getResult(
					NotUsedSecurityImpl.class,
					notUsedSecurity.getPrimaryKey()) == null) {

				cacheResult(notUsedSecurity);
			}
		}
	}

	/**
	 * Clears the cache for all not used securities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NotUsedSecurityImpl.class);

		finderCache.clearCache(NotUsedSecurityImpl.class);
	}

	/**
	 * Clears the cache for the not used security.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NotUsedSecurity notUsedSecurity) {
		entityCache.removeResult(NotUsedSecurityImpl.class, notUsedSecurity);
	}

	@Override
	public void clearCache(List<NotUsedSecurity> notUsedSecurities) {
		for (NotUsedSecurity notUsedSecurity : notUsedSecurities) {
			entityCache.removeResult(
				NotUsedSecurityImpl.class, notUsedSecurity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NotUsedSecurityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NotUsedSecurityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new not used security with the primary key. Does not add the not used security to the database.
	 *
	 * @param notUsedSecurityId the primary key for the new not used security
	 * @return the new not used security
	 */
	@Override
	public NotUsedSecurity create(long notUsedSecurityId) {
		NotUsedSecurity notUsedSecurity = new NotUsedSecurityImpl();

		notUsedSecurity.setNew(true);
		notUsedSecurity.setPrimaryKey(notUsedSecurityId);

		notUsedSecurity.setCompanyId(CompanyThreadLocal.getCompanyId());

		return notUsedSecurity;
	}

	/**
	 * Removes the not used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security that was removed
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity remove(long notUsedSecurityId)
		throws NoSuchNotUsedSecurityException {

		return remove((Serializable)notUsedSecurityId);
	}

	/**
	 * Removes the not used security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the not used security
	 * @return the not used security that was removed
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity remove(Serializable primaryKey)
		throws NoSuchNotUsedSecurityException {

		Session session = null;

		try {
			session = openSession();

			NotUsedSecurity notUsedSecurity = (NotUsedSecurity)session.get(
				NotUsedSecurityImpl.class, primaryKey);

			if (notUsedSecurity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNotUsedSecurityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(notUsedSecurity);
		}
		catch (NoSuchNotUsedSecurityException noSuchEntityException) {
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
	protected NotUsedSecurity removeImpl(NotUsedSecurity notUsedSecurity) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(notUsedSecurity)) {
				notUsedSecurity = (NotUsedSecurity)session.get(
					NotUsedSecurityImpl.class,
					notUsedSecurity.getPrimaryKeyObj());
			}

			if (notUsedSecurity != null) {
				session.delete(notUsedSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (notUsedSecurity != null) {
			clearCache(notUsedSecurity);
		}

		return notUsedSecurity;
	}

	@Override
	public NotUsedSecurity updateImpl(NotUsedSecurity notUsedSecurity) {
		boolean isNew = notUsedSecurity.isNew();

		if (!(notUsedSecurity instanceof NotUsedSecurityModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(notUsedSecurity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					notUsedSecurity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in notUsedSecurity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NotUsedSecurity implementation " +
					notUsedSecurity.getClass());
		}

		NotUsedSecurityModelImpl notUsedSecurityModelImpl =
			(NotUsedSecurityModelImpl)notUsedSecurity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (notUsedSecurity.getCreateDate() == null)) {
			if (serviceContext == null) {
				notUsedSecurity.setCreateDate(date);
			}
			else {
				notUsedSecurity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!notUsedSecurityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				notUsedSecurity.setModifiedDate(date);
			}
			else {
				notUsedSecurity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(notUsedSecurity);
			}
			else {
				notUsedSecurity = (NotUsedSecurity)session.merge(
					notUsedSecurity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NotUsedSecurityImpl.class, notUsedSecurityModelImpl, false, true);

		if (isNew) {
			notUsedSecurity.setNew(false);
		}

		notUsedSecurity.resetOriginalValues();

		return notUsedSecurity;
	}

	/**
	 * Returns the not used security with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the not used security
	 * @return the not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNotUsedSecurityException {

		NotUsedSecurity notUsedSecurity = fetchByPrimaryKey(primaryKey);

		if (notUsedSecurity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNotUsedSecurityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return notUsedSecurity;
	}

	/**
	 * Returns the not used security with the primary key or throws a <code>NoSuchNotUsedSecurityException</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security
	 * @throws NoSuchNotUsedSecurityException if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity findByPrimaryKey(long notUsedSecurityId)
		throws NoSuchNotUsedSecurityException {

		return findByPrimaryKey((Serializable)notUsedSecurityId);
	}

	/**
	 * Returns the not used security with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param notUsedSecurityId the primary key of the not used security
	 * @return the not used security, or <code>null</code> if a not used security with the primary key could not be found
	 */
	@Override
	public NotUsedSecurity fetchByPrimaryKey(long notUsedSecurityId) {
		return fetchByPrimaryKey((Serializable)notUsedSecurityId);
	}

	/**
	 * Returns all the not used securities.
	 *
	 * @return the not used securities
	 */
	@Override
	public List<NotUsedSecurity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @return the range of not used securities
	 */
	@Override
	public List<NotUsedSecurity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of not used securities
	 */
	@Override
	public List<NotUsedSecurity> findAll(
		int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the not used securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NotUsedSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of not used securities
	 * @param end the upper bound of the range of not used securities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of not used securities
	 */
	@Override
	public List<NotUsedSecurity> findAll(
		int start, int end,
		OrderByComparator<NotUsedSecurity> orderByComparator,
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

		List<NotUsedSecurity> list = null;

		if (useFinderCache) {
			list = (List<NotUsedSecurity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NOTUSEDSECURITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NOTUSEDSECURITY;

				sql = sql.concat(NotUsedSecurityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NotUsedSecurity>)QueryUtil.list(
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
	 * Removes all the not used securities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NotUsedSecurity notUsedSecurity : findAll()) {
			remove(notUsedSecurity);
		}
	}

	/**
	 * Returns the number of not used securities.
	 *
	 * @return the number of not used securities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NOTUSEDSECURITY);

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
		return "notUsedSecurityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NOTUSEDSECURITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NotUsedSecurityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the not used security persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		NotUsedSecurityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NotUsedSecurityUtil.setPersistence(null);

		entityCache.removeCache(NotUsedSecurityImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NOTUSEDSECURITY =
		"SELECT notUsedSecurity FROM NotUsedSecurity notUsedSecurity";

	private static final String _SQL_SELECT_NOTUSEDSECURITY_WHERE =
		"SELECT notUsedSecurity FROM NotUsedSecurity notUsedSecurity WHERE ";

	private static final String _SQL_COUNT_NOTUSEDSECURITY =
		"SELECT COUNT(notUsedSecurity) FROM NotUsedSecurity notUsedSecurity";

	private static final String _SQL_COUNT_NOTUSEDSECURITY_WHERE =
		"SELECT COUNT(notUsedSecurity) FROM NotUsedSecurity notUsedSecurity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "notUsedSecurity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NotUsedSecurity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NotUsedSecurity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NotUsedSecurityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}